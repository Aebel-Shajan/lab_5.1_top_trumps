package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

@Service
public class TopTrumpService {

    public String checkWinner(Card card1, Card card2) {
        Card winnerCard;
        if (card1.getCardValue() > card2.getCardValue() ) {
            winnerCard = card1;
        } else if (card1.getCardValue() == card2.getCardValue()) {
            return "Draw!";
        } else {
            winnerCard = card2;
        }
        return winnerCard.getRank().name() + " of " + winnerCard.getSuit().name() + " wins!";
    }
}
