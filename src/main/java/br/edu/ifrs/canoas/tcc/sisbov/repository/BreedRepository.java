package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Breed;

@Repository
public interface BreedRepository  extends JpaRepository<Breed, String> {
	Breed findById(Long id);
}
