package com.fiap.footballapi.controller;

import com.fiap.footballapi.dto.TeamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    //@PostMapping(/save-team)
    @GetMapping("/teams")
    public List<TeamDto> getTeamList() {
        return teamListDto;
    }

}
