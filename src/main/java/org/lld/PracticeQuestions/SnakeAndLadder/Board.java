package org.lld.PracticeQuestions.SnakeAndLadder;

import java.util.List;

public class Board {
    private int size;
    List<Snake> snakes;
    List<Ladder> ladders;

    public Board(int size, List<Snake> snakes, List<Ladder> ladders) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public int getSize() {
        return size;
    }

    public int getnextPosition(int newPosition){
        for(Snake snake : snakes){
            if(snake.getHead() == newPosition){
                System.out.println("Bitten by Snake at: " + newPosition);
                return snake.getTail();
            }
        }
        for(Ladder ladder : ladders){
            if(ladder.getStart() == newPosition){
                System.out.println("Climbing by Ladder at: " + newPosition);
                return ladder.getEnd();
            }
        }
        return newPosition;
    }
}
