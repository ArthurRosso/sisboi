package br.edu.ifrs.canoas.tcc.sisbov.service;

import org.springframework.stereotype.Service;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Breed;
import br.edu.ifrs.canoas.tcc.sisbov.repository.BreedRepository;

@Service
public class BreedService {

	private final BreedRepository breedRepository;

	public BreedService(BreedRepository breedRepository) {
		this.breedRepository = breedRepository;
	}

	public Iterable<Breed> listAll() {
		return breedRepository.findAll();
	}
	
	public Breed save(Breed breed) {
		return breedRepository.save(breed);
	}
	
	
	public Breed getOne(Breed breed) {
		return breedRepository.findById(breed.getId());
	}

}
