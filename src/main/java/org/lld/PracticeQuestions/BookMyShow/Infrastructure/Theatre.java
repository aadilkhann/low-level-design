package org.lld.PracticeQuestions.BookMyShow.Infrastructure;

import org.lld.PracticeQuestions.BookMyShow.Constants.SeatType;

import java.util.List;
import java.util.UUID;

public class Theatre {
    UUID uuid;
    String name;
    List<Screen>  screenList;

    public Theatre(UUID uuid, String name,int totalScreens) {
        this.uuid = uuid;
        this.name = name;
        for (int i = 0; i < totalScreens; i++) {
            screenList.add(new Screen(UUID.randomUUID(), "Screen-"+i+1,50,null));
        }
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
