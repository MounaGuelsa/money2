package com.example.money2.dtos;

import com.example.money2.entities.Projet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RapportDTO {

    private Long id;

    @NotBlank(message = "Le titre du rapport ne peut pas être vide")
    private String titreRapport;

    @NotNull(message = "La date de création du rapport doit être spécifiée")
    private LocalDate dateCreationRapport;

    @NotBlank(message = "Le contenu du rapport ne peut pas être vide")
    private String contenuRapport;

    @NotNull(message = "Le projet doit être spécifié")
    private Projet projetDTO;

}
