package com.example.leadrouter.repositories;

import com.example.leadrouter.models.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}