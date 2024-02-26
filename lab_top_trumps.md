# Lab - Top Trumps

Sticking with the idea of games played via Spring, your task is going to be building a Top Trumps style game with the classic 52 deck of cards. You will be given some start code to give you the skeleton of the app - your job is to finish up with the controller actions and gameplay checks.

Each card is made up of a Suit and a Rank (both of them are Enums).

Cards can have one of 4 Suits (`HEARTS`, `SPADES`, `DIAMONDS`, `CLUBS`), and 13 Ranks (`TWO`, `THREE`, `FOUR`, ...`TEN`, `JACK`, `QUEEN`, `KING`, `ACE`).
Each rank has their nominal value as a value property (e.g. 2 for `TWO`), `JACK`, `QUEEN`, `KING`, `ACE` have 11, 12, 13 and 14 respectively.

## MVP

* Create a `TopTrumpsController` and in it an endpoint to handle a POST request sent via Postman. The endpoint should take out 2 card objects from the RequestBody. (Note that we need to put the Card objects in an Array for this to work, see the sample payload below. Make sure the type of your RequestBody is ArrayList<Card>)
* Create a `TopTrumpsService` class that has a method called `checkWinner()`. This method should take in the 2 card objects.
* After determining which is the higher value card, send back a response with the appropriate message (e.g. "Queen of Hearts wins!")

## Extensions

* Edit the message to send an appropriate response in the event of a draw.
* (Hard) Modify the code so that you have to start a new game which creates a deck of cards, then every round played is going to remove the played cards from the deck to avoid playing the same cards multiple times. For this, you have to create a Deck variable that gets instantiated with cards after a post request, and then another post request plays the 2 cards.

### Hints:

Use a ResponseEntity as a reply with a message inside (can just be a String).

### Sample payload:

```json
[
    {
        "suit": "HEARTS",
        "rank": "QUEEN"
    },
    {
        "suit": "SPADES",
        "rank": "ACE"
    }
]
```

For which response should be:

```json
"ACE of SPADES wins!"
```