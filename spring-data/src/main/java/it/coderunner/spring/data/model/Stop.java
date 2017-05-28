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
public class Stop implements Serializable {


	private static final long serialVersionUID = 5034408425716562074L;

	@Id
	@GeneratedValue
	private int id;

	@Column(name="stop_symbol", nullable = false)
	private String stopSymbol;
	
	@Column(name="stop_name", nullable = false)
	private String stopName;
	
	@OneToMany (mappedBy = "stop")
	private Set<Departure> departures = new HashSet<>();
	
	public Stop(String stopSymbol, String stopName){
		this.stopSymbol = stopSymbol;
		this.stopName = stopName;
	}
	public Stop(){
		
	}
}