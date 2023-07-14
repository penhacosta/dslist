package com.adevaldo.dslits.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adevaldo.dslits.dto.GameListDTO;
import com.adevaldo.dslits.dto.GameMinDTO;
import com.adevaldo.dslits.service.GameListService;
import com.adevaldo.dslits.service.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private GameListService gameListService;
    private GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){
        return ResponseEntity.ok().body(gameListService.findAll());
    }

    @GetMapping("/{idList}/games")
    public List<GameMinDTO> findByList(@PathVariable Long idList){
       List<GameMinDTO> result = gameService.findByList(idList);
       return result;
    }





    
    
}
