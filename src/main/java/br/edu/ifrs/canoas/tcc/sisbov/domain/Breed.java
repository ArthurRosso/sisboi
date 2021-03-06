package br.edu.ifrs.canoas.tcc.sisbov.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Breed implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment") 
	@GenericGenerator( name = "increment", strategy = "increment")
	private Long id;
	
	private String breed;
	
	private String description;
	
	@OneToMany (mappedBy = "breed")
	private List<Animal> animal;
	
	@OneToMany (mappedBy = "breed")
	private List<TypeAnimal> typeAnimal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}

	public List<TypeAnimal> getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(List<TypeAnimal> typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	
	public String toString () {
		return getBreed();
	}
}
