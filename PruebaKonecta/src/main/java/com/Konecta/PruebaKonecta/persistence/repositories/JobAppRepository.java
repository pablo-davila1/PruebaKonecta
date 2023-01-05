package com.Konecta.PruebaKonecta.persistence.repositories;

import com.Konecta.PruebaKonecta.persistence.entities.Employe;
import com.Konecta.PruebaKonecta.persistence.entities.JobApp;
import com.Konecta.PruebaKonecta.services.dto.EmployeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface JobAppRepository extends JpaRepository<JobApp, Long> {
}
