package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.canoas.tcc.sisbov.domain.TypeAnimal;

@Repository
public interface TypeAnimalRepository extends JpaRepository<TypeAnimal, String> {
	TypeAnimal findById(Long id);
}
