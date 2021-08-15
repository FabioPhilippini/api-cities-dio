package com.fabio.citiesapi.dio.citiesapi.repository;

import com.fabio.citiesapi.dio.citiesapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
