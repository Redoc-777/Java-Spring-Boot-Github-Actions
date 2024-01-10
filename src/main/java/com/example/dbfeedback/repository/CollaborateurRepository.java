package com.example.dbfeedback.repository;


import com.example.dbfeedback.entity.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {
    Collaborateur findByNameOfCollaborateur(String Name);
}