package br.fiap.atividade.atividade.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.atividade.atividade.model.Moto;

@Controller
public class MotoController {
	
	@GetMapping("/motos")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("motos/index");
		Moto moto1= new Moto(307,"V-Rod Muscle", "Harley Davidson", 2012, 1247, 82.281);
		Moto moto2= new Moto(168,"Kawasaki Ninja 400", "Kawasaki", 2018, 400, 27.850);
		Moto moto3= new Moto(228,"H2R", "Kawasaki", 2019, 4695, 168.850);
		
		List<Moto> motos = Arrays.asList(moto1, moto2, moto3);
		modelView.addObject("motos", motos);
		
		return modelView;
	}
	
}
