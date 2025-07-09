package org.lld.PracticeQuestions.BookMyShow;

import org.lld.PracticeQuestions.BookMyShow.Infrastructure.Screen;

import java.time.LocalDateTime;

public class Show {
    Movie movie;
    Screen screen;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public Show(Movie movie, Screen screen, LocalDateTime startTime, LocalDateTime endTime) {
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
