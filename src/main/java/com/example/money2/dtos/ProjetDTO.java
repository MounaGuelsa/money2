package com.example.money2.dtos;

import com.example.money2.entities.Depense;
import com.example.money2.entities.Rapport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjetDTO {

    private Long idProjet;

    @NotBlank(message = "Le nom du projet ne peut pas être vide")
    private String nomProjet;

    private Set<Depense> listeDepensesDTO = new HashSet<>();

    private List<Rapport> listeRapportsDTO;
}
