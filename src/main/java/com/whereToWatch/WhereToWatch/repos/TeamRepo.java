package com.whereToWatch.WhereToWatch.repos;

import com.whereToWatch.WhereToWatch.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends CrudRepository<Team, Integer> {

    Team findTeamByName(String team);
}
