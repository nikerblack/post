package com.pruebas.post.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/hello")
	public String publicaciones() {
		
		return "publicaciones";
	}
}
