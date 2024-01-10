package com.example.dbfeedback.repository;

import com.example.dbfeedback.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}