package com.teclas.tutorial.repository;

import com.teclas.tutorial.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(Boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
