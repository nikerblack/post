package com.pruebas.post.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pruebas.post.model.Publicaciones;
import com.pruebas.post.service.PostService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PublicacionesViewController {
	
	private static final Logger LOG = LoggerFactory.getLogger(PublicacionesViewController.class);

	private PostService service;

	
	@GetMapping("/publicaciones")
	public String init(Model model) {
		List<Publicaciones> posts = service.getAllPost();
		model.addAttribute("publicaciones", new Publicaciones());
		model.addAttribute("books", posts);
		return "publicaciones";
	}

	@PostMapping("/publicaciones")
	public String buscar(@ModelAttribute Publicaciones publicaciones, Model model) {
		List<Publicaciones> posts = service.getPost(publicaciones);
		model.addAttribute("books", posts);
		return "publicaciones";
	}
}
