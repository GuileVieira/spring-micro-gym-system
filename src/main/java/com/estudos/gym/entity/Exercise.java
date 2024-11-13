package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "exercise_id")
    private Long id;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "exercises")
    private Set<Workout> workout = new HashSet<>();
}
