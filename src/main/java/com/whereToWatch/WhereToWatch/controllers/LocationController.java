package com.whereToWatch.WhereToWatch.controllers;


import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("api/locations")
    public  Iterable<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("api/location/{id}")
    public Location getLocationById(@PathVariable Integer id) {
        return locationService.getLocationById(id);
    }

    @GetMapping("api/locations/{city}")
    public Iterable<Location> getLocationsByCity(@PathVariable String city) {
        return locationService.getLocationsByCity(city);
    }



}

