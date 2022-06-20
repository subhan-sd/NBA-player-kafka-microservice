package com.example.demokafka.util;

import com.example.demokafka.dto.BaseResponse;

public class ResponseUtil {
    public static BaseResponse setResponse(String status, Object data){
        BaseResponse res = new BaseResponse();
        res.setStatus(status);
        res.setData(data);
        return res;
    }
}
