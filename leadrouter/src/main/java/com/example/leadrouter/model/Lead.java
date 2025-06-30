package com.example.leadrouter.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String industry;
    private String country;
    private double revenue;
    private String source;
    private LocalDateTime createdAt = LocalDateTime.now();
}