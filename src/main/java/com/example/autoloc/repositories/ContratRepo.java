package com.example.autoloc.repositories;

import com.example.autoloc.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepo extends JpaRepository<Contrat, Long> {
}
