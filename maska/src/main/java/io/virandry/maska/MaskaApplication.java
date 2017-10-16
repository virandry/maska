package io.virandry.maska;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.virandry.controller.ArticleController;

@SpringBootApplication
@ComponentScan("io.virandry.*")
public class MaskaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaskaApplication.class, args);
	}
}
