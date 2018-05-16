package br.edu.ifrs.canoas.tcc.sisbov.service;

import org.springframework.stereotype.Service;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Purpose;
import br.edu.ifrs.canoas.tcc.sisbov.domain.TypeAnimal;
import br.edu.ifrs.canoas.tcc.sisbov.repository.TypeAnimalRepository;

@Service
public class TypeAnimalService {
	
	private final TypeAnimalRepository typeAnimalRepository;
	
	public TypeAnimalService(TypeAnimalRepository typeAnimalRepository) {
		this.typeAnimalRepository = typeAnimalRepository;
	}

	public Iterable<TypeAnimal> listAll() {
		return typeAnimalRepository.findAll();
	}
	
	public TypeAnimal save(TypeAnimal typeAnimal) {
		return typeAnimalRepository.save(typeAnimal);
	}
	
	
	public TypeAnimal getOne(TypeAnimal typeAnimal) {
		return typeAnimalRepository.findById(typeAnimal.getId());
	}

}
