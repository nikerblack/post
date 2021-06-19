package com.pruebas.post.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pruebas.post.client.PostClient;
import com.pruebas.post.model.Publicaciones;

@Service
public class PostService {

	@Autowired
	public PostClient client;
	
	public List<Publicaciones> getAllPost(){
		String postsJson = client.getPost();
		List<Publicaciones> posts = new Gson().fromJson(postsJson, new TypeToken<List<Publicaciones>>(){}.getType());
		return posts;
	}

	public List<Publicaciones> getPost(Publicaciones post) {
		List<Publicaciones> list = new ArrayList<>();
		String postsJson = client.getPost(post.getId());
		Publicaciones postanw = new Gson().fromJson(postsJson, Publicaciones.class);
		list.add(postanw);
		return list;
	}
}


