package com.whereToWatch.WhereToWatch.repos;

import com.whereToWatch.WhereToWatch.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepo extends CrudRepository<Location, Integer>  {


    List<Location> findLocationsByCity(String city);

    Location findLocationByCity(String city);


//    SELECT *  FROM location
//    INNER JOIN location_table ON location.id = location_table.location.id
//    INNER JOIN team ON location_table.team.id = team.id
//    WHERE team.name = this.team;

}
