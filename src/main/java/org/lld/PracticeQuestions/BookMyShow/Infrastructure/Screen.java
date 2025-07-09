package org.lld.PracticeQuestions.BookMyShow.Infrastructure;

import org.lld.PracticeQuestions.BookMyShow.Constants.SeatType;
import org.lld.PracticeQuestions.BookMyShow.Show;

import java.util.List;
import java.util.UUID;

public class Screen {
    private UUID uuid;
    private String name;
    private List<Seat> seatList;
    Show show;

    public Screen(UUID uuid, String name, List<Seat> seatList) {
        this.uuid = uuid;
        this.name = name;
        this.seatList = seatList;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
