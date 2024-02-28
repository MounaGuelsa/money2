package com.example.money2.mappers;

import com.example.money2.dtos.BudgetDTO;
import com.example.money2.dtos.CategorieDTO;
import com.example.money2.entities.Budget;
import com.example.money2.entities.Categorie;
import org.mapstruct.Mapping;

public interface CtegorieMapper extends GlobalMapper<CategorieDTO, Categorie> {
    @Mapping(target = "budgetDTO",source ="budget")
    CategorieDTO toDTO(Categorie categorie);
    @Mapping(target = "budget",source ="budgetDTO")

    Categorie toEntity(CategorieDTO categorieDTO);
}
