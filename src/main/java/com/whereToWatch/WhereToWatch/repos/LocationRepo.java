package com.whereToWatch.WhereToWatch.repos;

import com.whereToWatch.WhereToWatch.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepo extends CrudRepository<Location, Integer>  {

    List<Location> findLocationsByCity(String city);

    Location findLocationByCity(String city);

//    Iterable<Location> findLocationsByTeam(String team);
//


//    SELECT m FROM Machine m WHERE m.machinePK.machineId = 10


}
