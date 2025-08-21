package com.example.Blogs_Web.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Blogs_Web.Repo.UserRepository;
import com.example.Blogs_Web.model.User;



@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String email, String password) {
        User user = repo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
