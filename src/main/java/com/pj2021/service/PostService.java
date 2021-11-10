package com.pj2021.service;

import java.util.List;

import com.pj2021.entity.Post;

public interface PostService {
	List<Post> readAll();
	Post create(Post post);
	Post update(Post post);
	Post read(int id);
	void delete(int id);
}
