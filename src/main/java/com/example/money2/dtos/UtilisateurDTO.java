package com.example.money2.dtos;

import com.example.money2.entities.Depense;
import com.example.money2.entities.Notification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UtilisateurDTO {

    private Long id;

    private String nom;

    private String email;

    private String motDePasse;

    private Date dateInscription;


    private List<Depense> listeDepensesDTO;

    private List<Notification> listeNotifsDTO;
}
