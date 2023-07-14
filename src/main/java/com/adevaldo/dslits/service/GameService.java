package com.adevaldo.dslits.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adevaldo.dslits.dto.GameDTO;
import com.adevaldo.dslits.dto.GameMinDTO;
import com.adevaldo.dslits.entities.Game;
import com.adevaldo.dslits.projections.GameMinProjection;
import com.adevaldo.dslits.repository.GameRepository;

@Service
public class GameService {
    
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }


    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
         Game game = gameRepository.findById(id).get();
         return new GameDTO(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return  gameRepository.findAll()
         .stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

     
}
