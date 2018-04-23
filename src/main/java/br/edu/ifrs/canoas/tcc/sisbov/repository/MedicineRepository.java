package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, String>{
	Medicine findByCod(Long cod);
}
