package org.lld.PracticeQuestions.BookMyShow;

import java.util.List;
import java.util.UUID;

public class User {
    private UUID uuid;
    private String name;
    private List<Booking> bookings;

    public User(UUID uuid, String name, List<Booking> bookings) {
        this.uuid = uuid;
        this.name = name;
        this.bookings = bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
