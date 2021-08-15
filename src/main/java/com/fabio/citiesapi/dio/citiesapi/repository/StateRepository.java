package com.fabio.citiesapi.dio.citiesapi.repository;

import com.fabio.citiesapi.dio.citiesapi.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Long> {
}
