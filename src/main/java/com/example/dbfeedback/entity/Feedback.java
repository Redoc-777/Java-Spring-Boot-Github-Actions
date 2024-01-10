package com.example.dbfeedback.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name="feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @Column(name = "ambiance")
    private String feedback1;

    @Column(name = "aspectsPositifs")
    private int feedback2Rating;

    @Column(name = "aspectsAmeliores")
    private String feedback3;

    @Column(name = "satisfaction")
    private int feedback4Rating;

    @Column(name = "avantages")
    private int feedback5Rating;

    @Column(name = "star")
    private String communicationRating;

    @Column(name="name_of_collaborateur")
    private String nameOfCollaborateur;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private LocalDate Created_at;

}