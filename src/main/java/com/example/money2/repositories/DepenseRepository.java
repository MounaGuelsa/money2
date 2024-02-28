package com.example.money2.repositories;

import com.example.money2.entities.Depense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepenseRepository  extends JpaRepository<Depense,Long> {
}
