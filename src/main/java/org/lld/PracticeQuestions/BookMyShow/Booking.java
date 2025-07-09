package org.lld.PracticeQuestions.BookMyShow;

import org.lld.PracticeQuestions.BookMyShow.Constants.BookingStatus;
import org.lld.PracticeQuestions.BookMyShow.Infrastructure.Seat;

import java.util.List;
import java.util.UUID;

public class Booking {
    UUID id;
    private UUID uuid;
    Show show;
    User user;
    List<Seat> bookedSeat;
    BookingStatus  bookingStatus;
    Payment payment;

    public Booking(UUID id, UUID uuid, Show show, User user, List<Seat> bookedSeat, BookingStatus bookingStatus, Payment payment) {
        this.id = id;
        this.uuid = uuid;
        this.show = show;
        this.user = user;
        this.bookedSeat = bookedSeat;
        this.bookingStatus = bookingStatus;
        this.payment = payment;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Show getShow() {
        return show;
    }

    public User getUser() {
        return user;
    }

    public List<Seat> getBookedSeat() {
        return bookedSeat;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBookedSeat(List<Seat> bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
