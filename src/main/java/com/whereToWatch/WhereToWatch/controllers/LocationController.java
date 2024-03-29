package com.whereToWatch.WhereToWatch.controllers;


import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.models.LocationRequest;
import com.whereToWatch.WhereToWatch.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("locations/{city}")
    public Iterable<Location> findByLocations(@PathVariable String city) {
        return locationService.findAllLocationsByCity(city);
    }
    @GetMapping("location/{city}")
    public Location findByLocation(@PathVariable String city) {
        return locationService.findLocationByCity(city);
    }

    @GetMapping("locations/{city}/{team}")
    public Iterable<Location> findLocationByCityAndTeam(@PathVariable String city, @PathVariable String team) {
        return locationService.findLocationByCityAndTeam(city, team);
    }

    @GetMapping("locationByTeam/{team}")
    public Iterable<Location> findLocationsbyTeam(@PathVariable String team) {
        return locationService.findLocationsbyTeam(team);
    }


    @PostMapping("location/{teamName}")
        public Location addLocation (@RequestBody LocationRequest locationRequest, @PathVariable String teamName) {
            return locationService.addLocation(locationRequest, teamName);
    }
}

