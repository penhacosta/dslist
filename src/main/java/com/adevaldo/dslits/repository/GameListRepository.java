package com.adevaldo.dslits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adevaldo.dslits.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
