package com.Konecta.PruebaKonecta.services;


import com.Konecta.PruebaKonecta.Exceptions.JobAddExptns.JobAddExceptions;
import com.Konecta.PruebaKonecta.mappers.EmployeMapper.EmployeDtoToEmploye;
import com.Konecta.PruebaKonecta.mappers.JobAppMapper.JobAppDtoToJobApp;
import com.Konecta.PruebaKonecta.persistence.entities.JobApp;
import com.Konecta.PruebaKonecta.persistence.repositories.JobAppRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobAppServices {
    private final JobAppRepository jobAppRepository;
    private final JobAppDtoToJobApp jobAppMapper;
    private final EmployeDtoToEmploye employeMapper;

    public JobAppServices(JobAppRepository jobAppRepository, JobAppDtoToJobApp jobAppMapper, JobAppDtoToJobApp jobAppMapper1, EmployeDtoToEmploye employeMapper) {
        this.jobAppRepository = jobAppRepository;
        this.jobAppMapper = jobAppMapper1;
        this.employeMapper = employeMapper;
    }
    public List<JobApp> getAll (){
        return this.jobAppRepository.findAll();
    }
    public JobApp getById (Long id){
        Optional<JobApp> optional = this.jobAppRepository.findById(id);
        if(optional.isEmpty()){
            throw new JobAddExceptions("The job application whit this id not exist", HttpStatus.NOT_FOUND);
        }
        return this.jobAppRepository.getById(id);
    }
}
