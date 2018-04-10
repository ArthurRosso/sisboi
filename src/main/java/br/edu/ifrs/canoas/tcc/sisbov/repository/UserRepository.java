package br.edu.ifrs.canoas.tcc.sisbov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifrs.canoas.tcc.sisbov.domain.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findByUsername(String username);
}
