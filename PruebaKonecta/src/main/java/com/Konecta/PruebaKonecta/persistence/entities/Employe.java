package com.Konecta.PruebaKonecta.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "employe")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime admissionDate;
    private String name;
    private Number salary;
    @OneToOne(mappedBy = "employe", cascade = CascadeType.ALL)
    private JobApp jobApp;
}
