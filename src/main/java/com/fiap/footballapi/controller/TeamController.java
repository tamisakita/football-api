package com.fiap.footballapi.controller;

import com.fiap.footballapi.dto.TeamDto;
import com.fiap.footballapi.dto.TeamFilterDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/football")
public class TeamController {

    private final List<TeamDto> teamListDto = new ArrayList<>();

    public TeamController() {
        TeamDto teamDto = new TeamDto();
        teamDto.setId(1L);
        teamDto.setName("Palmeiras");
        teamDto.setFoundationDate(LocalDate.of(1960, 01, 01));
        teamDto.setMembers(30_000_000);
        teamListDto.add(teamDto);

        TeamDto teamDto01 = new TeamDto();
        teamDto01.setId(2L);
        teamDto01.setName("Corinthians");
        teamDto01.setFoundationDate(LocalDate.of(1960, 01, 01));
        teamDto01.setMembers(30_000_000);
        teamListDto.add(teamDto);
    }

    @GetMapping("/teams") //@RequestParams
    public List<TeamDto> getTeamList(TeamFilterDto teamFilterDto) {
        return teamListDto.stream()
                .filter(teamDto -> teamDto.getName() == null || teamDto.getName().contains(teamFilterDto.getName()))
                .collect(Collectors.toList()); //transformando em list de novo
    }

    @GetMapping("/teams/{id}")
    public TeamDto getTeamById(@PathVariable Long id) {

        return teamListDto.stream()
                .filter(teamDto -> teamDto.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
