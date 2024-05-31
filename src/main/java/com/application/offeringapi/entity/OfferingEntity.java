package com.application.offeringapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "OFFERING_TABLE")
@Data
@NoArgsConstructor
public class OfferingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OFFERING_ID")
    private long offeringId;
    @Column(nullable = false, length = 50)
    private String offeringName;
    private String description;
    private String eligibilityCriteria;
}
