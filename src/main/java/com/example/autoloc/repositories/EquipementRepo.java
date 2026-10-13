package com.example.autoloc.repositories;

import com.example.autoloc.entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepo extends JpaRepository<Equipement, Long> {
}
