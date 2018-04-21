package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/novoAnimal", method=RequestMethod.GET)
	public String novoAnimal () {
		return "novoAnimal";
	}

	
	@RequestMapping(value="/novoAnimal", method=RequestMethod.POST)
	public String novoAnimal (Animal animal) {
		
		ar.save(animal);
		
		return "redirect:/novoAnimal";
	}
}
