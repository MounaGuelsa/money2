package com.example.money2.mappers;

import com.example.money2.dtos.NotificationDTO;
import com.example.money2.dtos.ProjetDTO;
import com.example.money2.entities.Projet;
import org.mapstruct.Mapping;

import javax.management.Notification;

public interface ProjetMapper extends GlobalMapper<ProjetDTO, Projet> {

    @Mapping(target = "listeDepensesDTO", source = "listeDepenses")
    @Mapping(target = "listeRapportsDTO", source = "listeRapports")

    ProjetDTO toDTO(Projet projet);

    @Mapping(target = "listeDepenses", source = "listeDepensesDTO")
    @Mapping(target = "listeRapports", source = "listeRapportsDTO")
    Projet toEntity(ProjetDTO projetDTO);
}
