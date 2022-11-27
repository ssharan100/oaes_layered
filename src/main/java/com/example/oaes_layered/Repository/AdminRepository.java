package com.example.oaes_layered.Repository;

import com.example.oaes_layered.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Optional<Admin> findAdminByUsername(String username);
}
