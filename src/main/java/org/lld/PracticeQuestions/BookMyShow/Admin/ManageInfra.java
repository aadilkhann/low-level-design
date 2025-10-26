package org.lld.PracticeQuestions.BookMyShow.Admin;

import org.lld.PracticeQuestions.BookMyShow.Infrastructure.City;
import org.lld.PracticeQuestions.BookMyShow.Infrastructure.Theatre;

import java.util.List;
import java.util.UUID;

public class ManageInfra {
    public void addNewTheatre(String theatreName, String cityName , Integer screens, List<City> cities){
        Theatre theatre=new Theatre(UUID.randomUUID(),cityName,screens);
        for(int i=0;i<cities.size();i++){
            if(cities.get(i).getName().equals(cityName)){
//                cities.get(i).setTheatreList();
            }
        }
    }

    public City addNewCity(String cityName){
        return new City(UUID.randomUUID(),cityName,null);
    }
}
