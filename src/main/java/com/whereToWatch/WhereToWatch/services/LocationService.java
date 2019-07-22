package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.repos.LocationRepo;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private  LocationRepo locationRepo;
    public Location getLocationById (Integer id) {return locationRepo.findById(id).get();}
}
