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

    public Screen(UUID uuid, String name, int totalSeat, Show show) {
        this.uuid = uuid;
        this.name = name;
        this.show = show;

        for (int i = 0; i < totalSeat; i++) {
            seatList.add(new Seat(i,SeatType.PREMIUM));
        }
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

    public Show getShow() {
        return show;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
