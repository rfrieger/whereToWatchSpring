package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.models.Team;
import com.whereToWatch.WhereToWatch.models.TeamRequest;
import com.whereToWatch.WhereToWatch.repos.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

   @Autowired
    private TeamRepo teamRepo;

    public Team findTeamByName(String name) {
        return teamRepo.findTeamByName(name);
    }

    public Team addTeam (TeamRequest teamRequest) {
        Team team = new Team();
        team.setName(teamRequest.getName());
        return teamRepo.save(team);
    }
}
