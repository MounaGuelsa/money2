package com.example.money2.repositories;

import com.example.money2.entities.Projet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
