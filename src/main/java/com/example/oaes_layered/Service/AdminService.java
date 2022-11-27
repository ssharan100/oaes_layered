package com.example.oaes_layered.Service;

import com.example.oaes_layered.Entity.Admin;
import com.example.oaes_layered.Entity.Author;
import com.example.oaes_layered.Repository.AdminRepository;
import com.example.oaes_layered.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Autowired
    AuthorRepository authorRepository;

    public boolean registerAdmin(Admin admin) {
        adminRepository.save(admin);
        return true;
    }

    public boolean adminLogin(Admin admin) {
        Optional<Admin> obj = adminRepository.findAdminByUsername(admin.getUsername());
        if(obj.isEmpty())
        {
            return false;
        }
        if(obj.get().getPassword().equals(admin.getPassword()))
        {
            return true;
        }
        return false;
    }

    public boolean registerAuthor(Author author) {
        authorRepository.save(author);
        return true;
    }
}
