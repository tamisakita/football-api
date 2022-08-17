package com.fiap.footballapi.repository;

import com.fiap.footballapi.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
    List<TeamEntity> findAllByNameContaining(String nome);
}
