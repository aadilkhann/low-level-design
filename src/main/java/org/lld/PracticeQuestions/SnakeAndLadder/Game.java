package org.lld.PracticeQuestions.SnakeAndLadder;

import java.util.*;

public class Game {
    Board board;
    Dice dice;
    Queue<Player> players;

    public Game(Board board, Dice dice, List<Player> players) {
        this.board = board;
        this.dice = dice;
        this.players = new LinkedList<>(players);
    }

    public void startGame() {
        while (true) {
            Player currentPlayer = players.poll();
            int playersPosition = currentPlayer.getPosition();

            int moves = dice.rollDice();
            System.out.println(currentPlayer.getName() + " got " + moves);

            int newPosition = board.getnextPosition(moves + playersPosition);

            if (newPosition > board.getSize()) {
                currentPlayer.setPosition(playersPosition); //Redundant
                System.out.println("Player " + currentPlayer.getName() + " got no moves");
                players.offer(currentPlayer);
                continue;
            }
            currentPlayer.setPosition(newPosition);
            players.offer(currentPlayer);

            if(newPosition==board.getSize()){
                System.out.println("Player " + currentPlayer.getName() + " Wins");
                break;
            }
        }
    }
}
