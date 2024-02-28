package com.example.money2.mappers;

import com.example.money2.dtos.BudgetDTO;
import com.example.money2.dtos.FactureDTO;
import com.example.money2.entities.Budget;
import com.example.money2.entities.Facture;
import org.mapstruct.Mapping;

public interface FactureMapper extends GlobalMapper<FactureDTO, Facture> {
    @Mapping(target = "depenseDTO",source ="depense")
    FactureDTO toDTO(Facture facture);
    @Mapping(target = "depense",source ="depenseDTO")

    Facture toEntity(FactureDTO factureDTO);
}
