package com.fiap.footballapi.service;

import com.fiap.footballapi.dto.CreateUpdateTeamDto;
import com.fiap.footballapi.dto.TeamDto;
import com.fiap.footballapi.dto.UpdateTeamMembersDto;

import java.util.List;

public interface TeamService {

    TeamDto create(CreateUpdateTeamDto createUpdateTeamDto);
    TeamDto getTeamById(Long id);
    List<TeamDto> getTeamList(String nome);
    TeamDto update(Long id, CreateUpdateTeamDto createUpdateTeamDto);
    TeamDto updateMembers(Long id, UpdateTeamMembersDto updateTeamMembersDto);
    void delete(Long id);
}
