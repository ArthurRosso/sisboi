package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Purpose;

@Repository
public interface PurposeRepository extends JpaRepository<Purpose, String> {
	Purpose findById(Long id);
}
