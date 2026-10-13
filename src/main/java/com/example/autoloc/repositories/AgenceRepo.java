package com.example.autoloc.repositories;

import com.example.autoloc.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenceRepo extends JpaRepository<Agence, Long> {
}
