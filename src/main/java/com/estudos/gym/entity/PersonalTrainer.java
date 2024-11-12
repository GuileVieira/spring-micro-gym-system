package com.estudos.gym.entity;

import com.estudos.gym.entity.abstracts.UserAbstract;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PersonalTrainer  extends UserAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "personal_trainer_id")
    private Long id;
    private String speciality;

    ;
}
