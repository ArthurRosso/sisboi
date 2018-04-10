package br.edu.ifrs.canoas.tcc.sisbov.service;

import org.springframework.stereotype.Service;
import br.edu.ifrs.canoas.tcc.sisbov.domain.User;
import br.edu.ifrs.canoas.tcc.sisbov.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User save(User user) {
		User fetchedUser = this.getOne(user);
		fetchedUser.setUsername(user.getUsername());
		fetchedUser.setEmail(user.getEmail());
		return userRepository.save(fetchedUser);
	}

	public User getOne(User user) {
		return userRepository.findByUsername(user.getUsername()).get();
	}

}
