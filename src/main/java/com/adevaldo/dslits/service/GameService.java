package com.adevaldo.dslits.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adevaldo.dslits.dto.GameMinDTO;
import com.adevaldo.dslits.repository.GameRepository;

@Service
public class GameService {
    
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return  gameRepository.findAll()
         .stream().map(x -> new GameMinDTO(x)).toList();
        
    }
}
