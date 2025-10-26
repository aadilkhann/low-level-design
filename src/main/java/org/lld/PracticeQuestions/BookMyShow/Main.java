package org.lld.PracticeQuestions.BookMyShow;

import org.lld.PracticeQuestions.BookMyShow.Admin.ManageInfra;
import org.lld.PracticeQuestions.BookMyShow.Infrastructure.City;
import org.lld.PracticeQuestions.BookMyShow.Infrastructure.Theatre;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Create Users (User Registration)
//        User adil=new User(UUID.randomUUID(),"Adil",null);
//        User aditi=new User(UUID.randomUUID(),"Aditi",null);
//
//        //Create Infrastructure (Super Admin can add or Remove Theatre)
//        Theatre pvr=new Theatre(UUID.randomUUID(),"PVR",4);
//        Theatre inox=new Theatre(UUID.randomUUID(),"iNox",5);
//
//        //Creating Shows and Adding Movies (Admin can add or remove)
//        Movie Avengers=new Movie(UUID.randomUUID(),"Avengers","Action","English");
//        pvr.getScreenList().stream().filter(key->key.getShow()).
//        Show marvel=new Show(Avengers,pvr.getScreenList())

        //List of all cities in BMS
        List<City> cities =new ArrayList<>();
        //Create Object of Admin/ Infra
        ManageInfra  manageInfra = new ManageInfra();
        //Adding cities
        City newCity=manageInfra.addNewCity("Bengaluru");
        cities.add(newCity);
        City newCity1=manageInfra.addNewCity("Delhi");
        cities.add(newCity1);

        manageInfra.addNewTheatre();

    }
}
