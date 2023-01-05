package com.Konecta.PruebaKonecta.persistence.repositories;

import com.Konecta.PruebaKonecta.persistence.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
