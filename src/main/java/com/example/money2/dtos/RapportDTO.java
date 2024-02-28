package com.example.money2.dtos;

import com.example.money2.entities.Projet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RapportDTO {

    private Long id;

    private String titreRapport;

    private LocalDate dateCreationRapport;

    private String contenuRapport;

    private Projet projetDTO;

}
