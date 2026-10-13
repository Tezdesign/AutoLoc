package com.example.autoloc.repositories;

import com.example.autoloc.entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepo extends JpaRepository<Maintenance, Long> {
}
