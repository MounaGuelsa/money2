package com.example.money2.dtos;

import com.example.money2.entities.Depense;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FactureDTO {

    private String numeroFacture;

    private String fournisseur;


    private Depense depenseDTO;
}
