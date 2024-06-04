package com.udea.arqui.parcial.rest.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udea.arqui.parcial.rest.jpa.model.City;

@Repository
public interface CityRepository extends CrudRepository<Long, City> {

}
