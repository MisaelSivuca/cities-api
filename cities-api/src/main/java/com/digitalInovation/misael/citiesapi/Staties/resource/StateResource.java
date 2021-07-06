package com.digitalInovation.misael.citiesapi.Staties.resource;

import com.digitalInovation.misael.citiesapi.Staties.entity.State;
import com.digitalInovation.misael.citiesapi.Staties.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    @Autowired
    private final StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    public List<State> staties(){
        return repository.findAll();
    }
}
