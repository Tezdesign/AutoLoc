package com.example.autoloc.entities;
import com.example.autoloc.entities.enums.CategorieVehicule;
import com.example.autoloc.entities.enums.StatutVehicule;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

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

    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agence_id")
    private Agence agence;

    @ManyToMany
    @JoinTable(name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "vehicule_id"),
            inverseJoinColumns = @JoinColumn(name = "equipement_id"))
    private List<Equipement> equipements = new ArrayList<>();
}
