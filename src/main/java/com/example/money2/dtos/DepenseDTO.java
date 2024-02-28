package com.example.money2.dtos;

import com.example.money2.entities.Categorie;
import com.example.money2.entities.Facture;
import com.example.money2.entities.Projet;
import com.example.money2.entities.Utilisateur;
import com.example.money2.entities.enums.MoyennePaiement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepenseDTO {
    private Long idDepense;

    @Positive(message = "Le montant de la dépense doit être positif")
    private double montant;

    @NotNull(message = "La date de la dépense doit être spécifiée")
    private LocalDate date;


    private String description;
    private String lieu;
    private String notes;

    @NotNull(message = "La catégorie doit être spécifiée")
    private Categorie categorieDTO;

    private Facture factureDTO;
    private Set<Projet> listeProjetsDTO = new HashSet<>();

    @NotNull(message = "Le moyen de paiement doit être spécifié")
    private MoyennePaiement moyennePaiement;

    @NotNull(message = "L'utilisateur doit être spécifié")
    private Utilisateur utilisateurDTO;
}
