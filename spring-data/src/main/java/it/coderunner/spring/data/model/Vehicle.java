package it.coderunner.spring.data.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Vehicle implements Serializable {


	private static final long serialVersionUID = 5034408425716562074L;

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String type;
	
	@OneToMany (mappedBy = "vehicle")
	private Set<Trip> trips = new HashSet<>();

	public Vehicle(String name, String type){
		this.name = name;
		this.type = type;
	}
	public Vehicle(){
		
	}
}