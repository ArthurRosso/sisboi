package br.edu.ifrs.canoas.tcc.sisbov.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Animal;
import br.edu.ifrs.canoas.tcc.sisbov.domain.Purpose;
import br.edu.ifrs.canoas.tcc.sisbov.domain.Weight;
import br.edu.ifrs.canoas.tcc.sisbov.service.AnimalService;
import br.edu.ifrs.canoas.tcc.sisbov.service.BreedService;
import br.edu.ifrs.canoas.tcc.sisbov.service.PurposeService;
import br.edu.ifrs.canoas.tcc.sisbov.service.TypeAnimalService;

@Controller
public class AnimalController {
	
	private final AnimalService animalService;
	private final BreedService breedService;
	private final TypeAnimalService typeAnimalService;
	private final PurposeService purposeService;

	public AnimalController(AnimalService animalService, BreedService breedService, TypeAnimalService typeAnimalService, PurposeService purposeService) {
		this.animalService = animalService;
		this.breedService = breedService;
		this.typeAnimalService = typeAnimalService;
		this.purposeService = purposeService;
	}
	
	@GetMapping("/showAnimals")
	public String showAnimals(Model model){
		model.addAttribute("animals", animalService.listAll());
		return "showAnimals";
	}
	
	@GetMapping("/newAnimal")
	public String newAnimal(Model model) {
		model.addAttribute("animal", new Animal());
		model.addAttribute("breeds", breedService.listAll());
		model.addAttribute("types", typeAnimalService.listAll());
		model.addAttribute("purposeList", purposeService.listAll());
		model.addAttribute("peso", new Float(0));
		model.addAttribute("weight", new Weight());
		return "newAnimal";
	}
	
	@PostMapping("/save")
	public String save(@Valid Animal animal, Float peso, HttpServletRequest request) {
		System.out.println(request.getParameter("purposes"));
		Long codpurpose = Long.parseLong(request.getParameter("purposes"));
		Purpose p = purposeService.getOne(codpurpose);
		animal.getPurposes().add(p);
		animalService.save(animal, peso);
		return "redirect:/showAnimals";
	}
}
