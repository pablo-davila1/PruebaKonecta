package com.Konecta.PruebaKonecta.persistence.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jobapp")
public class JobApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private String description;
    private String resume;
    @OneToOne
    @JoinColumn(name = "id_employe")
    private Employe employe;
}
