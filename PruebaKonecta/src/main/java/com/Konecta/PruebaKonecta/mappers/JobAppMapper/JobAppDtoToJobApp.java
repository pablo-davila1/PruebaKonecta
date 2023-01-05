package com.Konecta.PruebaKonecta.mappers.JobAppMapper;

import com.Konecta.PruebaKonecta.persistence.entities.JobApp;
import com.Konecta.PruebaKonecta.services.dto.JobAppDto;
import org.springframework.stereotype.Component;

@Component
public class JobAppDtoToJobApp implements IJobAppMapper<JobAppDto, JobApp>{
    @Override
    public JobApp map(JobAppDto in) {
        JobApp jobApp = new JobApp();
        jobApp.setCode(in.getCode());
        jobApp.setDescription(in.getDescription());
        jobApp.setResume(in.getResume());
        return jobApp;
    }
}
