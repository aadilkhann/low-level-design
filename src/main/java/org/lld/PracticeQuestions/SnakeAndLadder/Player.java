package org.lld.PracticeQuestions.SnakeAndLadder;

public class Player {
    int position;
    String name;

    public Player(int position, String name) {
        this.position = position;
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
