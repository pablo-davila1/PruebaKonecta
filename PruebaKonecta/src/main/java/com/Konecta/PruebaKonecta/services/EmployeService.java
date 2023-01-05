package com.Konecta.PruebaKonecta.services;

import com.Konecta.PruebaKonecta.Exceptions.JobAddExptns.JobAddExceptions;
import com.Konecta.PruebaKonecta.mappers.EmployeMapper.EmployeDtoToEmploye;
import com.Konecta.PruebaKonecta.mappers.JobAppMapper.JobAppDtoToJobApp;
import com.Konecta.PruebaKonecta.persistence.entities.Employe;
import com.Konecta.PruebaKonecta.persistence.entities.JobApp;
import com.Konecta.PruebaKonecta.persistence.repositories.EmployeRepository;
import com.Konecta.PruebaKonecta.services.dto.EmployeDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {
    private final EmployeRepository employeRepository;
    private final EmployeDtoToEmploye employeMapper;
    private final JobAppDtoToJobApp jobAppMapper;

    public EmployeService(EmployeRepository employeRepository, EmployeDtoToEmploye mapper, EmployeDtoToEmploye employeMapper, JobAppDtoToJobApp jobAppMapper) {
        this.employeRepository = employeRepository;
        this.employeMapper = employeMapper;
        this.jobAppMapper = jobAppMapper;
    }
    public Employe createEmploye (EmployeDto employeDto ){
        Employe employe = employeMapper.map(employeDto);
        JobApp jobApp = new JobApp();
        jobApp.setCode(employeDto.getCode());
        jobApp.setResume(employeDto.getResume());
        jobApp.setDescription(employeDto.getDescription());
        jobApp.setEmploye(employe);
            employe.setJobApp(jobApp);
        return this.employeRepository.save(employe);
    }
    public List<Employe> listEmployes () {
        return this.employeRepository.findAll();
    }
    public Employe getById (Long id) {
        Optional<Employe> optional = this.employeRepository.findById(id);
        if(optional.isEmpty()){
            throw new JobAddExceptions("The Employe whit this id not exist", HttpStatus.NOT_FOUND);
        }
        return this.employeRepository.getById(id);
    }
}
