package com.example.money2.mappers;

public interface GlobalMapper<DTO,ENTITY>{
    DTO toDTO(ENTITY e);
    ENTITY toEntity(DTO o);
}




















