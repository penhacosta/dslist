package com.adevaldo.dslits.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adevaldo.dslits.dto.GameListDTO;
import com.adevaldo.dslits.entities.GameList;
import com.adevaldo.dslits.repository.GameListRepository;

@Service
public class GameListService {



    private GameListRepository gameListRepository;


    public GameListService(GameListRepository gameListRepository){
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll(); 
        return result.stream().map(x -> new GameListDTO(x)).toList();  
    }
    
}
