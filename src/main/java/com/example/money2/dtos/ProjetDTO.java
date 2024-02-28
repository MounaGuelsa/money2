package com.example.money2.dtos;

import com.example.money2.entities.Depense;
import com.example.money2.entities.Rapport;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjetDTO {

    private Long idProjet;

    private String nomProjet;

    private Set<Depense> listeDepensesDTO = new HashSet<>();

    private List<Rapport> listeRapportsDTO;
}
