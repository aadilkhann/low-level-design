package org.lld.PracticeQuestions.BookMyShow;

import org.lld.PracticeQuestions.BookMyShow.Infrastructure.Theatre;

import java.util.UUID;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Create Users (User Registration)
        User adil=new User(UUID.randomUUID(),"Adil",null);
        User aditi=new User(UUID.randomUUID(),"Aditi",null);

        //Create Infrastructure (Super Admin can add or Remove Theatre)
        Theatre pvr=new Theatre(UUID.randomUUID(),"PVR",4);
        Theatre inox=new Theatre(UUID.randomUUID(),"iNox",5);

        //Creating Shows and Adding Movies (Admin can add or remove)
        Movie Avengers=new Movie(UUID.randomUUID(),"Avengers","Action","English");
        pvr.getScreenList().stream().filter(key->key.getShow()).
        Show marvel=new Show(Avengers,pvr.getScreenList())
    }
}
