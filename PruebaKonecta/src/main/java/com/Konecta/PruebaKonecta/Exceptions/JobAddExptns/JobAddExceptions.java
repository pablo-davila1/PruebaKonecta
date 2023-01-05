package com.Konecta.PruebaKonecta.Exceptions.JobAddExptns;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JobAddExceptions extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public JobAddExceptions(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
