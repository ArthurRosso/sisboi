package br.edu.ifrs.canoas.tcc.sisbov.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment") 
	@GenericGenerator( name = "increment", strategy = "increment")
	private Long id;
	
	private boolean active;

	private String name;

	private Date birthday;
	
	@ManyToOne
	private User user;
	
	@OneToMany (mappedBy = "animal")
	private List<Weight> weight;
	
	@ManyToOne
	private Breed breed;
	
	@ManyToMany
	private List<Purpose> purpose;
	
	@ManyToOne
	private TypeAnimal type;
	
	@ManyToMany
	private List<Medication> medication;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Weight> getWeight() {
		return weight;
	}

	public void setWeight(List<Weight> weight) {
		this.weight = weight;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public List<Purpose> getPurpose() {
		return purpose;
	}

	public void setPurpose(List<Purpose> purpose) {
		this.purpose = purpose;
	}

	public TypeAnimal getType() {
		return type;
	}

	public void setType(TypeAnimal type) {
		this.type = type;
	}
	
	public List<Medication> getMedication() {
		return medication;
	}

	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
	
	public String getLastWeight() {
		if (weight.isEmpty()) {
			return "-";
		}
		return this.weight.get(weight.size()-1).toString();
	}
	
	public String getPurposes(){
		if (purpose.isEmpty()) {
			return "-";
		}
		String res = purpose.get(0).toString();
		for (Purpose p : purpose.subList(1, purpose.size())){
			res += ", " + p;
		}
		
		return res;
	}
	
}
