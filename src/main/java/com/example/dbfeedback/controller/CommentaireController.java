package com.example.dbfeedback.controller;

import com.example.dbfeedback.entity.Commentaire;
import com.example.dbfeedback.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CommentaireController {

    @Autowired
    private CommentaireRepository repo;

    @GetMapping("/commentaire")
    public List<Commentaire> getAllCommentaires() {
        return repo.findAll();
    }

    @GetMapping("/commentaire/{id}")
    public Commentaire getCommentaireById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/commentaire")
    public Commentaire saveCommentaireDetails(@RequestBody Commentaire commentaire) {
        return repo.save(commentaire);
    }

    @PutMapping("/commentaire")
    public Commentaire updateCommentaire(@RequestBody Commentaire commentaire) {
        return repo.save(commentaire);
    }

    @DeleteMapping("/commentaire/{id}")
    public ResponseEntity<HttpStatus> deleteCommentaireById(@PathVariable Long id) {
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
