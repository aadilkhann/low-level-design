package org.lld.PracticeQuestions.SnakeAndLadder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Snake> snakes = Arrays.asList(
                new Snake(99, 54),
                new Snake(70, 55),
                new Snake(52, 42)
        );

        List<Ladder> ladders = Arrays.asList(
                new Ladder(3, 22),
                new Ladder(5, 8),
                new Ladder(11, 26)
        );

        List<Player> players = Arrays.asList(
                new Player(0,"Alice"),
                new Player(0,"Bob")
        );

        Board board = new Board(100, snakes, ladders);
        Dice dice = new Dice(6);

        Game game = new Game(board, dice, players);
        game.startGame();
    }
}
