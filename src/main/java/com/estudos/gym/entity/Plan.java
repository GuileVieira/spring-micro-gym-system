package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plan {

    @Id
    @Column(name = "plan_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String planName;
    private Double price;
    private String description;
    private String billingCycle;
}
