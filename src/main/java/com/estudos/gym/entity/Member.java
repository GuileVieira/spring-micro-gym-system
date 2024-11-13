package com.estudos.gym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("MEMBER") // Identificador do tipo no banco de dados
public class Member extends User{
    /*@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "member_id")
    private Long id;*/
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;



    // Construtor padrão
    public Member() {
        super(); // Chama o construtor da superclasse (Object)
    }

    // Construtor com parâmetros
    public Member(String name, String email, String password, Enrollment enrollment) {
        super(name, email, password);
        this.enrollment = enrollment;


    }



}
