package com.example.money2.mappers;

import com.example.money2.dtos.DepenseDTO;
import com.example.money2.entities.Depense;
import org.mapstruct.Mapping;

public interface DepenseMapper extends GlobalMapper<DepenseDTO, Depense> {
    @Mapping(target = "categorieDTO",source ="categorie")
    @Mapping(target = "factureDTO",source ="analyses")
    @Mapping(target = "listeProjetsDTO",source ="listeProjetsDTO")
    @Mapping(target = "utilisateurDTO",source ="utilisateurDTO")

    DepenseDTO toDTO (Depense depense);
    @Mapping(target = "categorie",source ="categorieDTO")
    @Mapping(target = "facture",source ="factureDTO")
    @Mapping(target = "listeProjets",source ="listeProjetsDTO")
    @Mapping(target = "utilisateur",source ="utilisateurDTO")
    Depense toEntity(DepenseDTO depenseDTO);
}
