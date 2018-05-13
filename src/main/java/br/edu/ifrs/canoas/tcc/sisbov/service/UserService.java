package br.edu.ifrs.canoas.tcc.sisbov.service;

import org.springframework.stereotype.Service;
import br.edu.ifrs.canoas.tcc.sisbov.domain.User;
import br.edu.ifrs.canoas.tcc.sisbov.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository ur;

	public UserService (UserRepository ur) {
		this.ur = ur;
	}

	public User save (User user) {
		User fetchedUser = this.getOne(user);
		fetchedUser.setUsername(user.getUsername());
		fetchedUser.setEmail(user.getEmail());
		return ur.save(fetchedUser);
	}

	public User getOne (User user) {
		return ur.findByUsername(user.getUsername()).get();
	}

}
