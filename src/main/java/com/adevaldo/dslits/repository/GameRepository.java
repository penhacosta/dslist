package com.adevaldo.dslits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adevaldo.dslits.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
