package com.pj2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pj2021.entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
