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
	
	@RequestMapping("/showAnimals")
	public ModelAndView showAnimals(){
		ModelAndView mv = new ModelAndView("showAnimals");
		Iterable<Animal> animals = ar.findAll();
		mv.addObject("animals", animals);
		return mv;
	}
	
	@RequestMapping(value="/newAnimal", method=RequestMethod.GET)
	public String newAnimal () {
		return "newAnimal";
	}

	
	@RequestMapping(value="/newAnimal", method=RequestMethod.POST)
	public String newAnimal (Animal animal) {
		
		ar.save(animal);
		
		return "redirect:/newAnimal";
	}
}
