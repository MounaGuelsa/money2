package com.example.money2.dtos;

import com.example.money2.entities.Categorie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BudgetDTO {

        private Long idBudget;
        private String nomBudget;
        private YearMonth mois;
        private double montant;
        private Categorie categorieDTO;
}
