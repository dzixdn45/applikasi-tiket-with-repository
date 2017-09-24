package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
}
