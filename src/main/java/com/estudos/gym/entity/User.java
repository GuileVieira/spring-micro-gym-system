package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tab_users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Estratégia de herança
@DiscriminatorColumn(name = "user_type") // Coluna para identificar o tipo de usuário
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String email;
    private String password;

    public User() {}

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
