package br.edu.ifrs.canoas.tcc.sisbov.service;

import org.springframework.stereotype.Service;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Purpose;
import br.edu.ifrs.canoas.tcc.sisbov.repository.PurposeRepository;

@Service
public class PurposeService {

private final PurposeRepository purposeRepository;
	
	public PurposeService(PurposeRepository purposeRepository) {
		this.purposeRepository = purposeRepository;
	}

	public Iterable<Purpose> listAll() {
		return purposeRepository.findAll();
	}
	
	public Purpose save(Purpose purpose) {
		return purposeRepository.save(purpose);
	}
	
	
	public Purpose getOne(Long id) {
		return purposeRepository.findById(id);
	}
}
