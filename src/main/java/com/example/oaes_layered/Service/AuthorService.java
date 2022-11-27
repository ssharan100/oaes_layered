package com.example.oaes_layered.Service;

import com.example.oaes_layered.Entity.Author;
import com.example.oaes_layered.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public int authorLogin(Author author) {
        Optional<Author> obj = authorRepository.findAuthorByUsername(author.getUsername());
        if(obj.isEmpty())
        {
            return -1;
        }
        if(obj.get().getPassword().equals(author.getPassword()))
        {
            return obj.get().getAuthorId();
        }
        return -1;
    }
}
