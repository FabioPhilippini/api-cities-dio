package com.fabio.citiesapi.dio.citiesapi.repository;

import com.fabio.citiesapi.dio.citiesapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
