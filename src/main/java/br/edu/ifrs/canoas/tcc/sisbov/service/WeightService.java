package br.edu.ifrs.canoas.tcc.sisbov.service;

import org.springframework.stereotype.Service;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Weight;
import br.edu.ifrs.canoas.tcc.sisbov.repository.WeightRepository;

@Service
public class WeightService {
	
private final WeightRepository weightRepository;
	
	public WeightService(WeightRepository weightRepository) {
		this.weightRepository = weightRepository;
	}

	public Iterable<Weight> listAll() {
		return weightRepository.findAll();
	}
	
	public Weight save(Weight weight) {
		return weightRepository.save(weight);
	}
	
	public Weight getOne(Long id) {
		return weightRepository.findById(id);
	}

}
