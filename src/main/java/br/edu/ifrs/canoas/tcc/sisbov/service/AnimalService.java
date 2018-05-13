package br.edu.ifrs.canoas.tcc.sisbov.service;

import org.springframework.stereotype.Service;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Animal;
import br.edu.ifrs.canoas.tcc.sisbov.repository.AnimalRepository;

@Service
public class AnimalService {
	
	private final AnimalRepository ar;
	
	public AnimalService (AnimalRepository ar) {
		this.ar = ar;
	}

	public Animal save (Animal animal) {
		Animal fetchedAnimal = this.getOne(animal);
		fetchedAnimal.setName(animal.getName());
		fetchedAnimal.setActive(animal.isActive());
		fetchedAnimal.setBirthday(animal.getBirthday());
		return ar.save(fetchedAnimal);
	}

	public Animal getOne(Animal animal) {
		return ar.findById(animal.getId());
	}

}
