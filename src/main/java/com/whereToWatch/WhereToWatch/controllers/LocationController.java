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

    @GetMapping("api/locations/{city}/{team}")
    public Iterable<Location> findLocationsByCityAndTeam(@PathVariable String city, @PathVariable String team) {
        return locationService.findAllLocations(city, team);
    }

    @PostMapping("api/location")
        public Location createPost(@RequestBody Location location) {
            return locationService.addLocation(location);
    }



}

