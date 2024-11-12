package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
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
