package com.example.Blogs_Web.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blogs_Web.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
