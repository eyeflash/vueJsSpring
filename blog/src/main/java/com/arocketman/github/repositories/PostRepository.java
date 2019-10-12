package com.arocketman.github.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arocketman.github.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
