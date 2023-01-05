package com.Konecta.PruebaKonecta.services.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EmployeDto {
    private String name;
    private Number salary;
    private String code;
    private String description;
    private String resume;
}
