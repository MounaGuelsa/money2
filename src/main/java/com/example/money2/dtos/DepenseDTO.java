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

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepenseDTO {
    private Long idDepense;

    private double montant;

    private LocalDate date;

    private String description;

    private String lieu;

    private String notes;

    private Categorie categorie;
    private Facture facture;
    private Set<Projet> listeProjets = new HashSet<>();
    private MoyennePaiement moyennePaiement;

    private Utilisateur utilisateur;


}
