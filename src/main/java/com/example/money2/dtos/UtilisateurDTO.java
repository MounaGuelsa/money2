package com.example.money2.dtos;

import com.example.money2.entities.Depense;
import com.example.money2.entities.Notification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UtilisateurDTO {

    private Long id;

    @NotBlank(message = "Le nom de l'utilisateur ne peut pas être vide")
    private String nom;

    @Email(message = "L'adresse e-mail doit être valide")
    @NotBlank(message = "L'adresse e-mail ne peut pas être vide")
    private String email;

    @NotBlank(message = "Le mot de passe ne peut pas être vide")
    private String motDePasse;


    @NotNull(message = "La date d'inscription doit être spécifiée")
    private Date dateInscription;

    private List<Depense> listeDepensesDTO;

    private List<Notification> listeNotifsDTO;
}
