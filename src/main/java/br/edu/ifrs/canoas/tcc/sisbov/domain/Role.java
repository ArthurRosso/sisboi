package br.edu.ifrs.canoas.tcc.sisbov.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	@GeneratedValue
	private Long id;
	
	private String role;
	
	@ManyToMany
	private Set<User> accounts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<User> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<User> accounts) {
		this.accounts = accounts;
	}
}
