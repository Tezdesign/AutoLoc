package com.example.autoloc.entities;

import com.example.autoloc.entities.enums.ModePaiement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPaiement;
    BigDecimal montant;
    LocalDate datePaiement;
    @Enumerated(EnumType.STRING)
    ModePaiement modePaiement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contrat_id")
    private Contrat contrat;
}
