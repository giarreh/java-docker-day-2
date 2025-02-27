package com.booleanuk.api.repositories;

import com.booleanuk.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String username);
    User findByEmail(String email);
    boolean existsByUsername(String username);
}
