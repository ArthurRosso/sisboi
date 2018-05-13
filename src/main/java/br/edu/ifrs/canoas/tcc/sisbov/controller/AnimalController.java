package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifrs.canoas.tcc.sisbov.domain.*;
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
	public String newAnimal(Model m){
		
		m.addAttribute("animal", new Animal());
		
		return "newAnimal";
	}

	
	@RequestMapping(value="/newAnimal", method=RequestMethod.POST)
	public String newAnimal (Animal animal) {
		
		ar.save(animal);
		
		return "redirect:/newAnimal";
	}
	
	@RequestMapping(value="/{cod}", method=RequestMethod.GET)
	public ModelAndView detailsAnimal (@PathVariable("id") Long id) {
		Animal animal = ar.findById(id);
		ModelAndView mv = new ModelAndView("animal");
		mv.addObject("animal", animal);
		
		return mv;
	}
}
