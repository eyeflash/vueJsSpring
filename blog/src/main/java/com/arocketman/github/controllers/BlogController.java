package com.arocketman.github.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arocketman.github.entities.Post;
import com.arocketman.github.services.PostService;


@RestController
public class BlogController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value = "/posts")
	public List<Post> posts(){
		System.out.println("###select post");
		System.out.println("###select post");
		System.out.println("###select post");
		System.out.println("###select post");
		return postService.getAllPosts();
	}
	
	@PostMapping(value = "/post")
	public void publishPost(@RequestBody Post post) {
		System.out.println("###insert post");
		System.out.println("###insert post");
		System.out.println("###insert post");
		System.out.println("###insert post");
		postService.insert(post);
	}
	
	
}
