package com.Konecta.PruebaKonecta.controllers;

import com.Konecta.PruebaKonecta.persistence.entities.JobApp;
import com.Konecta.PruebaKonecta.services.JobAppServices;
import com.Konecta.PruebaKonecta.services.dto.EmployeDto;
import com.Konecta.PruebaKonecta.services.dto.JobAppDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobapp")
public class JobAppController {
    private final JobAppServices jobAppServices;
    public JobAppController(JobAppServices jobAppServices) {
        this.jobAppServices = jobAppServices;
    }
    @GetMapping("/getById/{id}")
    public JobApp getById(@RequestParam("id") Long id) {
        return this.jobAppServices.getById(id);
    }
    @GetMapping
    public List<JobApp> getAll() {
        return this.jobAppServices.getAll();
    }
}
