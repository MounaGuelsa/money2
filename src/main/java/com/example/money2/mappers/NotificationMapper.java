package com.example.money2.mappers;

import com.example.money2.dtos.BudgetDTO;
import com.example.money2.dtos.NotificationDTO;
import com.example.money2.entities.Budget;
import org.mapstruct.Mapping;

import javax.management.Notification;

public interface NotificationMapper extends GlobalMapper<NotificationDTO, Notification> {
    @Mapping(target = "utilisateurDTO", source = "utilisateur")
    NotificationDTO toDTO(Notification notification);

    @Mapping(target = "utilisateur", source = "utilisateurDTO")
    Notification toEntity(NotificationDTO notificationDTO);
}
