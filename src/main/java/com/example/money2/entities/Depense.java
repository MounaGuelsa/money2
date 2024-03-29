package com.example.money2.entities;

import com.example.money2.entities.enums.MoyennePaiement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashSet;
import java.util.Set;


import javax.persistence.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Depense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepense;

    private double montant;

    private LocalDate date;

    private String description;

    private String lieu;

    private String notes;


    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;




    @OneToOne(mappedBy = "depense")
    private Facture facture;
    @ManyToMany(mappedBy = "listeDepenses")
    private Set<Projet> listeProjets = new HashSet<>();
    private MoyennePaiement moyennePaiement;
    @ManyToOne
    private Utilisateur utilisateur;


}
