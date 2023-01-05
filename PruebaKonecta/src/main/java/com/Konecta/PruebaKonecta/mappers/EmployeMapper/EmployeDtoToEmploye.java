package com.Konecta.PruebaKonecta.mappers.EmployeMapper;

import com.Konecta.PruebaKonecta.persistence.entities.Employe;
import com.Konecta.PruebaKonecta.services.dto.EmployeDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class EmployeDtoToEmploye implements IEmployeMpper<EmployeDto, Employe> {

    @Override
    public Employe map(EmployeDto in) {
        Employe employe = new Employe();
        employe.setName(in.getName());
        employe.setSalary(in.getSalary());
        employe.setAdmissionDate(LocalDateTime.now());
        return employe;
    }
}
