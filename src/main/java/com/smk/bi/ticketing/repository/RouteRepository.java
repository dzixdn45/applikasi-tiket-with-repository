package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends CrudRepository<Route,Long> {
}
