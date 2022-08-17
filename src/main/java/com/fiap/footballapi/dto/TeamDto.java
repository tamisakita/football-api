package com.fiap.footballapi.dto;

import com.fiap.footballapi.entity.TeamEntity;

import java.time.LocalDate;

public class TeamDto {
    private Long id;
    private String name;
    private LocalDate foundationDate;
    private Integer members;

    public TeamDto() {}

    public TeamDto(TeamEntity teamEntity) {
        this.id = teamEntity.getId();
        this.name = teamEntity.getName();
        this.foundationDate = teamEntity.getFoundationDate();
        this.members = teamEntity.getMembers();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }
}
