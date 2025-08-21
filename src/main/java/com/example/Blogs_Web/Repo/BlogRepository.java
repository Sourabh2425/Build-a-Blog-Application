package com.example.Blogs_Web.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blogs_Web.model.Blog;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findByUserId(Long userId);
}
