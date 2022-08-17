package com.fiap.footballapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fiap.footballapi.dto.CreateUpdateTeamDto;
import com.fiap.footballapi.dto.TeamDto;
import com.fiap.footballapi.dto.UpdateTeamMembersDto;
import com.fiap.footballapi.entity.TeamEntity;
import com.fiap.footballapi.repository.TeamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;
    private ObjectMapper objectMapper;

    public TeamServiceImpl(TeamRepository teamRepository,
                           ObjectMapper objectMapper) {
        this.teamRepository = teamRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public TeamDto create(CreateUpdateTeamDto createUpdateTeamDto) {
        TeamEntity teamEntity = new TeamEntity(createUpdateTeamDto);
        TeamEntity savedTeamEntity = teamRepository.save(teamEntity);
        return new TeamDto(savedTeamEntity);
    }

    @Override
    public TeamDto getTeamById(Long id) {
        TeamEntity teamEntity = teamRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        TeamDto teamDto = objectMapper.convertValue(teamEntity, TeamDto.class);
        return teamDto;
    }

    @Override
    public List<TeamDto> getTeamList(String nome) {
        List<TeamEntity> list;
        if (nome == null) {
            list = teamRepository.findAll();
        } else {
            list = teamRepository.findAllByNameContaining(nome);
        }
        return list
                .stream()
                .map(TeamDto::new)
                .toList();
    }

    @Override
    public TeamDto update(Long id, CreateUpdateTeamDto createUpdateTeamDto) {
        TeamEntity teamEntity = teamRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        teamEntity.setName(createUpdateTeamDto.getName());
        teamEntity.setMembers(createUpdateTeamDto.getMembers());
        teamEntity.setFoundationDate(createUpdateTeamDto.getFoundationDate());

        TeamEntity savedEntity = teamRepository.save(teamEntity);
        return new TeamDto(savedEntity);
    }

    @Override
    public TeamDto updateMembers(Long id, UpdateTeamMembersDto updateTeamMembersDto) {
        TeamEntity teamEntity = teamRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        teamEntity.setMembers(updateTeamMembersDto.getMembers());
        TeamEntity savedEntity = teamRepository.save(teamEntity);
        return new TeamDto(savedEntity);
    }

    @Override
    public void delete(Long id) {

    }
}
