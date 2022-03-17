package br.com.fiap.atividade.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.fiap.atividade.atividade.controllers"})
public class AtividadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
	}

}
