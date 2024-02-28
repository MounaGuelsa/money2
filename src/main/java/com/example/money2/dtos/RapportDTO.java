package com.example.money2.dtos;

import com.example.money2.entities.Projet;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class RapportDTO {

    private Long id;

    private String titreRapport;

    private LocalDate dateCreationRapport;

    private String contenuRapport;

    private Projet projet;

}
