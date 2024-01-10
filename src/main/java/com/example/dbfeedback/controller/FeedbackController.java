package com.example.dbfeedback.controller;


import java.util.List;

import com.example.dbfeedback.entity.Feedback;
import com.example.dbfeedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins="*")
class FeedbackController {

    @Autowired
    private FeedbackRepository repo;


    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback() {
        return repo.findAll();
    }

    @GetMapping("/feedback/{id}")
    public Feedback getFeedbackById(@PathVariable Long id) {
        return repo.findById(id).get();
    }

    @PostMapping("/feedback")
    public Feedback saveFeedbackDetails(@RequestBody Feedback feedback) {
        return repo.save(feedback);
    }

    @PutMapping("/feedback")
    public Feedback updateFeedback(@RequestBody Feedback feedback) {
        return repo.save(feedback);
    }

    @DeleteMapping("/feedback/{id}")
    public ResponseEntity<HttpStatus> deleteFeedbackById(@PathVariable Long id) {
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
