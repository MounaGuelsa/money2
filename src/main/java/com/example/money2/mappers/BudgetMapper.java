package com.example.money2.mappers;
import com.example.money2.dtos.BudgetDTO;
import com.example.money2.entities.Budget;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel="spring")
public interface BudgetMapper extends GlobalMapper<BudgetDTO, Budget> {
    @Mapping(target = "categorieDTO",source ="categorie")

    BudgetDTO toDTO(Budget budget);
    @Mapping(target = "categorie",source ="categorieDTO")

    Budget toEntity(BudgetDTO budgetDTO);


}
