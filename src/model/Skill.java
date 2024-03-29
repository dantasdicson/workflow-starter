package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "skill")


public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SKILL" + "")
	@SequenceGenerator(name = "ID_SKILL", sequenceName = "SEQ_HABILIDADE", allocationSize = 1)
	private Integer id;

	private String name;

	// constructors

	public Skill(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Skill() {
	}

	// gets and sets

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// TOSTRING DE TODOS ATRIBUTOS

	@Override
	public String toString() {
		return  name;
	}

	// HASCHCODE DE ID HABILIDADE

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}