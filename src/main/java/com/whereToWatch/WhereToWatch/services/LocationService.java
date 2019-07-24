package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private  LocationRepo locationRepo;

    public Iterable<Location> getAllLocations() {
        return locationRepo.findAll();
    }

    public Location getLocationById (Integer id) {return locationRepo.findById(id).get();}

    public Iterable<Location> getLocationsByCity(String city) {
        return locationRepo.getAllByCity(city);
    }
}
