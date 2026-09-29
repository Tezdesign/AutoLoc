package com.example.autoloc.entities;
import com.example.autoloc.entities.enums.CategorieVehicule;
import com.example.autoloc.entities.enums.RoleEmployee;
import com.example.autoloc.entities.enums.StatutVehicule;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idvehicule;
    String immatriculation;
    String marque;
    String modele;
    BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    StatutVehicule statut;
    CategorieVehicule categorie;

}
