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

    @GetMapping("api/locationsByCity/{city}")
    public Iterable<Location> getLocationsByCity(@PathVariable String city) {
        return locationService.getLocationsByCity(city);
    }

    @GetMapping("api/locationsByTeam/{team}")
    public Iterable<Location> getLocationByTeam(@PathVariable String team) {
        return locationService.findLocationsbyTeam(team);
    }

    @GetMapping("api/locations/{city}/{team}")
    public Iterable<Location> findLocationsByCityAndTeam(@PathVariable String city, @PathVariable String team) {
        return locationService.findAllbyCityAndTeam(city, team);
    }

    @PostMapping("api/location")
        public Location createPost(@RequestBody Location location) {
            return locationService.addLocation(location);
    }



}

