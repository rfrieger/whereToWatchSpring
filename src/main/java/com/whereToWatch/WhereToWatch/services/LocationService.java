package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocationService {

    @Autowired
    private  LocationRepo locationRepo;

    public Iterable<Location> getAllLocations() {
        return locationRepo.findAll();
    }

    public Iterable<Location> getLocationsByCity(String city) {
        return locationRepo.findLocationsByCity(city);
    }

    public Iterable<Location> findLocationsbyTeam(String team) {
        return locationRepo.findLocationsByTeam(team);
    }

    public Iterable<Location> findAllbyCityAndTeam(String city, String team) {
        return locationRepo.findLocationsByCityAndAndTeam(city, team);
    }

    public Location addLocation(Location location) {return locationRepo.save(location);}


}
