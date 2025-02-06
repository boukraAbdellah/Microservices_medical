package com.uni.msordonance.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMed;

    private String nom;
    private int duree;

    private String dosage;
    private double cout;

    @ManyToOne
    private Ordonance ordonance;
}
