package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, String>{
	Animal findById(Long id);
}