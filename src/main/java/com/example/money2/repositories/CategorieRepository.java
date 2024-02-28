package com.example.money2.repositories;

import com.example.money2.entities.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
