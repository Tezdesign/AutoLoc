package com.example.autoloc.repositories;

import com.example.autoloc.entities.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository<employee, Long> {
}
