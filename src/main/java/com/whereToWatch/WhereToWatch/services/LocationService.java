package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;

import com.whereToWatch.WhereToWatch.models.LocationRequest;
import com.whereToWatch.WhereToWatch.models.Team;
import com.whereToWatch.WhereToWatch.repos.LocationRepo;
import com.whereToWatch.WhereToWatch.repos.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocationService {

    @Autowired
    private  LocationRepo locationRepo;

    @Autowired
    private TeamRepo teamRepo;

    public Iterable<Location> findAllLocationsByCity(String city) {
            return locationRepo.findLocationsByCity(city);
    }

    public Location addLocation(LocationRequest locationRequest, String teamName) {
        Location location = new Location();
        Team team = teamRepo.findTeamByName(teamName);
        location.setAddress(locationRequest.getAddress());
        location.setCity(locationRequest.getCity());
        location.setDescription(locationRequest.getDescription());
        location.setName(locationRequest.getName());

        location.getTeams().add(team);
        team.getLocations().add(location);

//        teamRepo.save(team);
        return locationRepo.save(location);
    }


     public  Location findLocationByCity(String city) {
         return locationRepo.findLocationByCity(city);

     }




}
