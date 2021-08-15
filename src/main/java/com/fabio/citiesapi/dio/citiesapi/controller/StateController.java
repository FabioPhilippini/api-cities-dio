package com.fabio.citiesapi.dio.citiesapi.controller;

import com.fabio.citiesapi.dio.citiesapi.entity.State;
import com.fabio.citiesapi.dio.citiesapi.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    private List<State> stateList(){
        return stateRepository.findAll();
    }
}
