package com.example.demokafka.config;

import com.example.demokafka.dto.GetNBAPlayer;
//import com.example.demokafka.service.dto.GetNBAPlayer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "NBAurl" , url = "https://free-nba.p.rapidapi.com/players")
public interface NBAConfig {

    @GetMapping( value = "/{postId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    GetNBAPlayer getNBAPlayer(@PathVariable String name);

}
