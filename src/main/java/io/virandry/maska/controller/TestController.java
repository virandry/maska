package io.virandry.maska.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("request")
public class TestController {

	@GetMapping("/test")
	public String testPage(Model model) {
		return "test-locale";
	}
}
