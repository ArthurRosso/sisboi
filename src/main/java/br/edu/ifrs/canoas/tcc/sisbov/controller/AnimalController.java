package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Animal;
import br.edu.ifrs.canoas.tcc.sisbov.repository.AnimalRepository;

@Controller
public class AnimalController {
	
	@Autowired
	private AnimalRepository ar;
	
	@RequestMapping("/verAnimais")
	public ModelAndView listaAnimais(){
		ModelAndView mv = new ModelAndView("verAnimais");
		Iterable<Animal> animais = ar.findAll();
		mv.addObject("animais", animais);
		return mv;
	}

	@RequestMapping("/deletarAnimal")
	public String deletarAnimal(Long cod){
		Animal animal = ar.findByCod(cod);
		ar.delete(animal);
		return "redirect:/animais";
	}
}
