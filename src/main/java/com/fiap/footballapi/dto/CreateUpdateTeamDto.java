package com.fiap.footballapi.dto;

import java.time.LocalDate;

public class CreateUpdateTeamDto {

    private String name;
    private LocalDate foundationDate;
    private Integer members;

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
