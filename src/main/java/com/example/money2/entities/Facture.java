package com.example.money2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String numeroFacture;

    private String fournisseur;

    @OneToOne
    @JoinColumn(name = "idDepense")
    private Depense depense;
}
