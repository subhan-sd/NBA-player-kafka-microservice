package com.example.demokafka.service;

import com.example.demokafka.config.NBAConfig;
import com.example.demokafka.dto.BaseResponse;
import com.example.demokafka.dto.GetNBAPlayer;
import com.example.demokafka.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class NBAService {

    private NBAConfig nbaConfig;

    public BaseResponse getPlayer(String name){
        log.info("Start Service GET NBA PLAYER ");
        GetNBAPlayer getNBAPlayer = nbaConfig.getNBAPlayer(name);
        return ResponseUtil.setResponse("Success", getNBAPlayer);
    }
}
