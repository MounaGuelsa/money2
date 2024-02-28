package com.example.money2.dtos;

import com.example.money2.entities.Budget;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategorieDTO {
    private Long idCategorie;

    private String nom;

    private Budget budget;
}

