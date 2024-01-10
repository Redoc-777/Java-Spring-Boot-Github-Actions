package com.example.dbfeedback.repository;

import com.example.dbfeedback.entity.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

}