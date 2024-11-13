package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalAssessment {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column(name = "physical_assessment_id")
    private Long id;
    private LocalDate assessmentDate = LocalDate.now();
    private String assessmentType;
    private String assessmentResult;
    private String assessmentComments;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Member member;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_trainer_id")
    private PersonalTrainer author;
}
