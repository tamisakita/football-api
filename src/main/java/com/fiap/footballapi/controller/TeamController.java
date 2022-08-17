package com.fiap.footballapi.controller;

import com.fiap.footballapi.dto.CreateUpdateTeamDto;
import com.fiap.footballapi.dto.TeamDto;
import com.fiap.footballapi.dto.TeamFilterDto;
import com.fiap.footballapi.dto.UpdateTeamMembersDto;
import com.fiap.footballapi.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping //@RequestParams
    public List<TeamDto> getTeamList(TeamFilterDto teamFilterDto) {
        return teamService.getTeamList(teamFilterDto.getName());
    }

    @GetMapping("{id}")
    public TeamDto getTeamById(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }

    @PostMapping("/create")
    public TeamDto create(@RequestBody CreateUpdateTeamDto createUpdateTeamDto) {
        return teamService.create(createUpdateTeamDto);
    }

    @PutMapping("{id}")
    public TeamDto update(@PathVariable Long id,
                          @RequestBody CreateUpdateTeamDto createUpdateTeamDto) {
        return teamService.update(id, createUpdateTeamDto);
    }

    @PatchMapping("{id}")
    public TeamDto updateMembers(@PathVariable Long id,
                                 @RequestBody UpdateTeamMembersDto updateTeamMembersDto) {
        return teamService.updateMembers(id, updateTeamMembersDto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        teamService.delete(id);
    }
}
