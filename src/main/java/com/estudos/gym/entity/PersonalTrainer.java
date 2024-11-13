package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("PERSONAL") // Identificador do tipo no banco de dados
public class PersonalTrainer extends User  {
   /* @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "personal_trainer_id")
    private Long id;*/

    private String speciality;

    public PersonalTrainer() {
        super();
    }

    public PersonalTrainer(String name, String email, String password, String speciality) {
        super(name, email, password);
        this.speciality = speciality;
    }

    ;
}
