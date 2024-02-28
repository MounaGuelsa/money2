package com.example.money2.dtos;

import com.example.money2.entities.Budget;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategorieDTO {
    private Long idCategorie;

    @NotBlank(message = "Le nom de la catégorie ne peut pas être vide")
    private String nom;

    @NotNull(message = "Le budget doit être spécifié")
    private Budget budgetDTO;
}
