package com.example.dbfeedback.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "collaborateur")
public class Collaborateur {
    @Column (nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name="name_of_collaborateur")
    private String nameOfCollaborateur;

    @Column(name="age")
    private int age;

    @Column(name="department")
    private String department;

    @Column(name="team")
    private String team;

}