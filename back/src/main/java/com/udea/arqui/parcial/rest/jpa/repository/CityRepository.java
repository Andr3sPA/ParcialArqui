package com.udea.arqui.parcial.rest.jpa.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udea.arqui.parcial.rest.jpa.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    Optional<City> findByNameAndCountry(String name, String country);

}
