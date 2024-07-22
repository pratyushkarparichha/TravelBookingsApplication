package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Feedback;


public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}
