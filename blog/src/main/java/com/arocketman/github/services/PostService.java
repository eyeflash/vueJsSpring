package com.arocketman.github.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arocketman.github.entities.Post;
import com.arocketman.github.repositories.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public List<Post> getAllPosts(){
		return postRepository.findAll();
	}

	public void insert(Post post) {
		postRepository.save(post);
	};
	
}
