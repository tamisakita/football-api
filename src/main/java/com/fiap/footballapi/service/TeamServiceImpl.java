package com.fiap.footballapi.service;

import com.fiap.footballapi.dto.CreateUpdateTeamDto;
import com.fiap.footballapi.dto.TeamDto;
import com.fiap.footballapi.dto.UpdateTeamMembersDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Override
    public TeamDto create(CreateUpdateTeamDto createUpdateTeamDto) {
        return null;
    }

    @Override
    public TeamDto getTeamById(Long id) {
        return null;
    }

    @Override
    public List<TeamDto> getTeamList(String nome) {
        return null;
    }

    @Override
    public TeamDto update(Long id, CreateUpdateTeamDto createUpdateTeamDto) {
        return null;
    }

    @Override
    public TeamDto updateMembers(Long id, UpdateTeamMembersDto updateTeamMembersDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
