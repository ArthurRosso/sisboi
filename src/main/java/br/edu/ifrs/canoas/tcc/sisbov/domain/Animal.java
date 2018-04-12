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
	private Long cod;

	private String id;

	private Date date;
	
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

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
