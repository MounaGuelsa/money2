package com.example.money2.dtos;

import java.time.LocalDateTime;

import com.example.money2.entities.Utilisateur;
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
public class NotificationDTO {
    private Long idNotif;

    @NotBlank(message = "Le contenu de la notification ne peut pas être vide")
    private String contenuNotif;

    @NotNull(message = "La date de création de la notification doit être spécifiée")
    private LocalDateTime dateCreationNotif;

    @NotNull(message = "L'utilisateur doit être spécifié")
    private Utilisateur utilisateurDTO;
}
