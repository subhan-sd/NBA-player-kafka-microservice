package com.example.demokafka.dto;

import lombok.Data;

@Data
public class GetNBAPlayer {
    private String id;
    private String first_name;
    private String last_name;
    private String height_feet;
    private String height_inches;
    private String position;
    private String weight_pounds;
}
