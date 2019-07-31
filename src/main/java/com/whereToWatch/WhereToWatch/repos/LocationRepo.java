package com.whereToWatch.WhereToWatch.repos;

import com.whereToWatch.WhereToWatch.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends CrudRepository<Location, Integer>  {

    Iterable<Location> findLocationsByCity(String city);

    Iterable<Location> findLocationsByTeam(String team);

    Iterable<Location> findLocationsByCityAndAndTeam(String city, String name);

}
