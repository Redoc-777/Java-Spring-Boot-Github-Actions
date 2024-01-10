package com.example.dbfeedback.controller;

import java.util.List;

import com.example.dbfeedback.entity.Collaborateur;
import com.example.dbfeedback.repository.CollaborateurRepository;
import com.example.dbfeedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
class CollaborateurController {

    @Autowired
    private CollaborateurRepository repo;

    @GetMapping("/collaborateur")
    public List<Collaborateur> getAllCollaborateur() {
        return repo.findAll();
    }

    @GetMapping("/collaborateur/{id}")
    public Collaborateur getCollaborateurById(@PathVariable Long id) {
        return repo.findById(id).get();
    }

    @PostMapping("/collaborateur")
    public Collaborateur saveCollaborateurDetails(@RequestBody Collaborateur collaborateur) {
        return repo.save(collaborateur);
    }


    @PutMapping("/collaborateur")
    public Collaborateur updateCollaborateur(@RequestBody Collaborateur collaborateur) {
        return repo.save(collaborateur);
    }

    @DeleteMapping("/collaborateur/{id}")
    public ResponseEntity<HttpStatus> deleteCollaborateurById(@PathVariable Long id) {
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
