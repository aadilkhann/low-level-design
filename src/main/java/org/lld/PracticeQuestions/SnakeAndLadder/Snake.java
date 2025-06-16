package org.lld.PracticeQuestions.SnakeAndLadder;

public class Snake {
    private int head;
    private int tail;

    public Snake(int head, int tail) {
        if(head < tail) throw new IllegalArgumentException("Head can not be less than Tail");
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }
}
