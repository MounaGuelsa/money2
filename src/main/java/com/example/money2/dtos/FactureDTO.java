package com.example.money2.dtos;

import com.example.money2.entities.Depense;
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
public class FactureDTO {

    @NotBlank(message = "Le numéro de facture ne peut pas être vide")
    private String numeroFacture;

    @NotBlank(message = "Le fournisseur ne peut pas être vide")
    private String fournisseur;

    @NotNull(message = "La dépense doit être spécifiée")
    private Depense depenseDTO;
}
