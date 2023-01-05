package com.Konecta.PruebaKonecta.Exceptions.EmployeExptns;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class EmployeExceptions extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public EmployeExceptions(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
