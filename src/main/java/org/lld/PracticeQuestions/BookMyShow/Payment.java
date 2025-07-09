package org.lld.PracticeQuestions.BookMyShow;

import org.lld.PracticeQuestions.BookMyShow.Constants.BookingStatus;
import org.lld.PracticeQuestions.BookMyShow.Constants.SeatType;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    UUID id;
    double price;
    BookingStatus paymentStatus;
    LocalDateTime paymentTime;

    public Payment(UUID id, double price, BookingStatus paymentStatus, LocalDateTime paymentTime) {
        this.id = id;
        this.price = price;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public UUID getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public BookingStatus getPaymentStatus() {
        return paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPaymentStatus(BookingStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
