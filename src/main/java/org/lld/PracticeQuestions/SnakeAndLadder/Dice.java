package org.lld.PracticeQuestions.SnakeAndLadder;

import java.util.Random;

public class Dice {
    int faces;
    private Random random;

    public Dice(int faces) {
        this.faces = faces;
        random = new Random();
    }

    public int rollDice() {
        int dice = random.nextInt(faces) + 1;
        return dice;
    }
}
