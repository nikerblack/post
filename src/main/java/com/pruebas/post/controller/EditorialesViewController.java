package com.pruebas.post.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pruebas.post.model.Publicaciones;
import com.pruebas.post.service.PostService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class EditorialesViewController {

	private PostService service;
	
	@RequestMapping(value = "/ediciones", method = RequestMethod.GET)
	public String initdos(final Publicaciones publicaciones, Model model) {
		service.getAllPost();
		model.addAttribute("ediciones", new Publicaciones());
		return "editoriales";
	}

	@RequestMapping(value = "/ediciones", method = RequestMethod.POST)
	public String saveSeedstarter(final Publicaciones publicaciones, final BindingResult bindingResult, final ModelMap modelMap, final Model model) {
		service.getAllPost();
		model.addAttribute("ediciones", new Publicaciones());
		//model.addAttribute("posts", new Post());
		return "editoriales";
	}
}
