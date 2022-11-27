package com.example.oaes_layered.Repository;

import com.example.oaes_layered.Entity.MCQ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MCQRepository extends JpaRepository<MCQ, Integer>
{
    List<MCQ> findBySubject(String subject);
}
