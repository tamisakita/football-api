package com.fiap.footballapi.repository;

import com.fiap.footballapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findFirstByUsername(String username);
}
