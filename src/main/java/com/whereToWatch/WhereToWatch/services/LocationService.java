package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocationService {

    @Autowired
    private  LocationRepo locationRepo;

    public Iterable<Location> findAllLocations(String city, String team) {
        if(city.equals("n")) {
            return locationRepo.findLocationsByTeam(team);
        } else if (team.equals("n")){
            return locationRepo.findLocationsByCity(city);
        } else{
            return locationRepo.findLocationsByCityAndAndTeam(city, team);
        }
    }

    public Location addLocation(Location location) {return locationRepo.save(location);}


}
