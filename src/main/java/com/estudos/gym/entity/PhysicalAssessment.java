package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalAssessment {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column(name = "physical_assessment_id")
    private Long id;
    private String assessmentDate;
    private String assessmentType;
    private String assessmentResult;
    private String assessmentComments;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;
}
