package com.uni.msordonance.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor @Entity
public class Ordonance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idOrdanace;

    private Date dateOrdonance;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "ordonance", cascade = CascadeType.ALL)
    private Set<Medicament> medicaments;

    private Long idPatient;



}
