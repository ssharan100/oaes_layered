package com.example.oaes_layered.Repository;

import com.example.oaes_layered.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findAuthorByUsername(String username);
}
