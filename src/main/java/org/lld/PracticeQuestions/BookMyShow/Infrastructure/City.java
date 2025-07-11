package org.lld.PracticeQuestions.BookMyShow.Infrastructure;

import java.util.List;
import java.util.UUID;

public class City {
    UUID uuid;
    String name;
    List<Theatre> theatreList;

    public City(UUID uuid, String name, List<Theatre> theatreList) {
        this.uuid = uuid;
        this.name = name;
        this.theatreList = theatreList;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }
}
