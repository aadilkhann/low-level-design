package org.lld.PracticeQuestions.BookMyShow.Infrastructure;

import org.lld.PracticeQuestions.BookMyShow.Constants.SeatType;
import org.lld.PracticeQuestions.BookMyShow.Constants.SeatStatus;

public class Seat {
    private int seatNumber;
    private SeatType seatType;
    private SeatStatus seatStatus;

    public Seat(int seatNumber, SeatType seatType, SeatStatus seatStatus) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public SeatStatus getStatus() {
        return seatStatus;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
