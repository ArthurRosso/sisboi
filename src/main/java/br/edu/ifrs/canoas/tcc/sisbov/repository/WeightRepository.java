package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Weight;

@Repository
public interface WeightRepository extends JpaRepository<Weight, String> {
	Weight findById(Long id);
}
