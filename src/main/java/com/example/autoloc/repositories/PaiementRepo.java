package com.example.autoloc.repositories;

import com.example.autoloc.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepo extends JpaRepository<Paiement, Long> {
}
