package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/topTrumps")
public class TopTrumpsController {
    @Autowired
    TopTrumpService topTrumpService;

    @PostMapping
    public ResponseEntity<String> newGame(@RequestBody ArrayList<Card> cards) {
        String winner = topTrumpService.checkWinner(cards.get(0), cards.get(1));
        return new ResponseEntity<>(winner, HttpStatus.CREATED);
    }

}


