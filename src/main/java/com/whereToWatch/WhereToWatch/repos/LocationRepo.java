package com.whereToWatch.WhereToWatch.repos;

import com.whereToWatch.WhereToWatch.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepo extends CrudRepository<Location, Integer>  {

    Iterable<Location> getAllByCity(String city);

}
