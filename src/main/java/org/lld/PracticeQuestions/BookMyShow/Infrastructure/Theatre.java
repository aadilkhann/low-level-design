package org.lld.PracticeQuestions.BookMyShow.Infrastructure;

import org.lld.PracticeQuestions.BookMyShow.Constants.SeatType;

import java.util.List;
import java.util.UUID;

public class Theatre {
    UUID uuid;
    String name;
    List<Screen>  screenList;

    public Theatre(UUID uuid, String name, List<Screen> screenList) {
        this.uuid = uuid;
        this.name = name;
        this.screenList = screenList;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }
}
