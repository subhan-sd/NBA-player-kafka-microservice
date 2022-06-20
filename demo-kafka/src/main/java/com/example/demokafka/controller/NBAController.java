package com.example.demokafka.controller;

import com.example.demokafka.dto.BaseResponse;
//import com.example.demokafka.service.dto.BaseResponse;
import com.example.demokafka.service.NBAService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ("/NBA"))
public class NBAController {

    private final NBAService NBAservice = new NBAService();

    @GetMapping(value = "/player/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse pokemonGet(@PathVariable String name){
        return NBAservice.getPlayer(name);
    }
}
