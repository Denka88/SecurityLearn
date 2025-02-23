package com.example.testsecurity.repo;

import com.example.testsecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser, Integer> {
    
    public AppUser findByEmail(String email);
    
}
