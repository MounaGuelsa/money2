package com.example.money2.mappers;

import com.example.money2.dtos.NotificationDTO;
import com.example.money2.dtos.RapportDTO;
import com.example.money2.entities.Rapport;
import org.mapstruct.Mapping;

import javax.management.Notification;

public interface RapportMapper extends GlobalMapper<RapportDTO,Rapport> {
    @Mapping(target = "projetDTO", source = "projet")
    RapportDTO toDTO(Rapport rapport);

    @Mapping(target = "projet", source = "projetDTO")
    Rapport toEntity(RapportDTO rapportDTO);

}
