package com.fiap.footballapi.entity;

import com.fiap.footballapi.dto.CreateUpdateTeamDto;
import com.fiap.footballapi.repository.TeamRepository;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_TEAM")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate foundationDate;
    private String name;
    private Integer members;

    public TeamEntity(){}

    public TeamEntity(CreateUpdateTeamDto createUpdateTeamDto) {
        this.name = createUpdateTeamDto.getName();
        this.foundationDate = createUpdateTeamDto.getFoundationDate();
        this.members = createUpdateTeamDto.getMembers();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

}
