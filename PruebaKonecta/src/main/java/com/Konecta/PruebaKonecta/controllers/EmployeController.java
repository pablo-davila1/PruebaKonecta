package com.Konecta.PruebaKonecta.controllers;


import com.Konecta.PruebaKonecta.persistence.entities.Employe;
import com.Konecta.PruebaKonecta.services.EmployeService;
import com.Konecta.PruebaKonecta.services.dto.EmployeDto;
import com.Konecta.PruebaKonecta.services.dto.JobAppDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employe")
public class EmployeController {
    private final EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @PostMapping
    public Employe createEmploye(@RequestBody EmployeDto employeDto){
        return this.employeService.createEmploye(employeDto);
    }

    @GetMapping
    public List<Employe> getAll (){
        return this.employeService.listEmployes();
    }

    @GetMapping("/getById/{id}")
    public Employe getById (@PathVariable("id") Long id){
        return this.employeService.getById(id);
    }
}
