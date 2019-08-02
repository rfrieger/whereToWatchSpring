package com.whereToWatch.WhereToWatch.controllers;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.models.Team;
import com.whereToWatch.WhereToWatch.models.TeamRequest;
import com.whereToWatch.WhereToWatch.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class TeamController {

    @Autowired
    public TeamService teamService;


    @GetMapping("api/team/{name}")
    public Team findByLocation(@PathVariable String name) {
        return teamService.findTeamByName(name);
    }

    @PostMapping("api/team")
    public Team addTeam(@RequestBody TeamRequest teamRequest) {
        return teamService.addTeam(teamRequest);
    }
}
