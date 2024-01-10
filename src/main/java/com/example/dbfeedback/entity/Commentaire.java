package com.example.dbfeedback.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "commentaire")
public class Commentaire {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "feedback_id")
        private Long feedbackId;

        @Column(name = "comment")
        private String comment;

}
