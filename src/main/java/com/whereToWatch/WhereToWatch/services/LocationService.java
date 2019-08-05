package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;

import com.whereToWatch.WhereToWatch.models.LocationRequest;
import com.whereToWatch.WhereToWatch.models.Team;
import com.whereToWatch.WhereToWatch.repos.LocationRepo;
import com.whereToWatch.WhereToWatch.repos.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LocationService {

    @Autowired
    private  LocationRepo locationRepo;

    @Autowired
    private TeamRepo teamRepo;

    public Iterable<Location> findLocationByCityAndTeam(String city, String team) {
        List<Location> locations =  locationRepo.findLocationsByCity(city);
        List<Location> filteredLocations = new ArrayList<>();
        System.out.println(locations.size());

        for (Location location : locations) {
            if(location.getTeams().size()>0) {
                if (location.getTeams().get(0).getName().equals(team)) {
                    filteredLocations.add(location);
                }
            }
        }
        return filteredLocations;
    }


    public List<Location> findAllLocationsByCity(String city) {
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

     public Iterable<Location> findLocationsbyTeam(String team){
        Team tempTeam = new Team();
        tempTeam = teamRepo.findTeamByName(team);
        List<Location> locations = new ArrayList<>();
        for(Location location: tempTeam.getLocations()) {
            System.out.println(location);
            locations.add(location);
        }
        return locations;
    }
}
