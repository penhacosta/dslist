package com.adevaldo.dslits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adevaldo.dslits.dto.GameMinDTO;
import com.adevaldo.dslits.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll(){
         return ResponseEntity.ok().body(gameService.findAll());
    }
    
}
