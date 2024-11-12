package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "billing_id")
    private Long id;
    private String billingDate;
    private String paidDate;
    private Double amount;
    private String paymentStatus;
    private String paymentMethod;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;


}
