package com.example.money2.dtos;

import com.example.money2.entities.Categorie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BudgetDTO {

        private Long idBudget;

        @NotBlank(message = "Le nom du budget ne peut pas être vide")
        private String nomBudget;

        @NotNull(message = "Le mois doit être spécifié")
        private YearMonth mois;

        @Positive(message = "Le montant du budget doit être positif")
        private double montant;

        @NotNull(message = "La catégorie doit être spécifiée")
        private Categorie categorieDTO;
}
