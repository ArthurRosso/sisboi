package br.edu.ifrs.canoas.tcc.sisbov.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Animal;
import br.edu.ifrs.canoas.tcc.sisbov.domain.Weight;
import br.edu.ifrs.canoas.tcc.sisbov.repository.AnimalRepository;
import br.edu.ifrs.canoas.tcc.sisbov.repository.WeightRepository;

@Service
public class AnimalService {
	
	private final AnimalRepository animalRepository;
	private final WeightRepository weightRepository;
	private final WeightService weightService;
	
	public AnimalService (AnimalRepository animalRepository, WeightRepository weightRepository, WeightService weightService) {
		this.animalRepository = animalRepository;
		this.weightRepository = weightRepository;
		this.weightService = weightService;
	}
	
	public Iterable<Animal> listAll() {
		return animalRepository.findAll();
	}

	/*
	public Animal save (Animal animal) {
		Animal fetchedAnimal = this.getOne(animal);
		fetchedAnimal.setName(animal.getName());
		fetchedAnimal.setBirthday(animal.getBirthday());
		fetchedAnimal.setBreed(animal.getBreed());
		fetchedAnimal.setPurpose(animal.getPurpose());
		fetchedAnimal.setType(animal.getType());
		return animalRepository.save(fetchedAnimal);
	}
	*/
	
	@Transactional
	public Animal save(Animal animal, Float peso) {
		//salva weight
		Weight w = new Weight();
		w.setWeight(peso);
		weightService.save(w);
		animal.getWeight().add(w);
		weightRepository.save(animal.getWeight());
		return animalRepository.save(animal);
	}
	
	
	public Animal getOne(Animal animal) {
		return animalRepository.findById(animal.getId());
	}

}
