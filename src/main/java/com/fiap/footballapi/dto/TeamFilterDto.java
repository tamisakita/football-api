package com.fiap.footballapi.dto;

public class TeamFilterDto {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public TeamFilterDto(String name) {
        this.name = name;
    }
}
