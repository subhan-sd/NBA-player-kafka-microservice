package com.example.demokafka.dto;

import lombok.Data;

@Data
public class BaseResponse   {
    private String status;
    private Object data;
}
