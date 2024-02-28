package com.example.money2.mappers;

import com.example.money2.dtos.ProjetDTO;
import com.example.money2.dtos.UtilisateurDTO;
import com.example.money2.entities.Projet;
import com.example.money2.entities.Utilisateur;
import org.mapstruct.Mapping;

public interface UtilisateurMapper extends GlobalMapper<UtilisateurDTO, Utilisateur> {
    @Mapping(target = "listeNotifsDTO", source = "listeNotifs")
    @Mapping(target = "listeDepensesDTO", source = "listeDepenses")
    ProjetDTO toDTO(Projet projet);

    @Mapping(target = "listeNotifs", source = "listeNotifsDTO")
    @Mapping(target = "listeDepenses", source = "listeDepensesDTO")
    Projet toEntity(ProjetDTO projetDTO);
}
