package it.coderunner.spring.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Trip implements Serializable {


	private static final long serialVersionUID = 5711651958724442355L;

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String line;

	@Column(name="trip_number", nullable = false)
	private int tripNumber;
	
	@Column(name="day_type", nullable = false)
	private String dayType;
	
	@Column(nullable = false)
	private int distance;
	
	@Column(nullable = false)
	private String start;
	
	@Column(nullable = false)
	private String end;
	
	@ManyToOne
	@JoinColumn(name="vehicle_id", nullable = false)
	private Vehicle vehicle;
	
	@OneToMany (mappedBy = "trip")
	private Set<Departure> departures = new HashSet<>();
	
	public Trip(String line, int tripNumber, String dayType, int distance, String start, String end, Vehicle vehicle){
		this.line = line;
		this.tripNumber = tripNumber;
		this.dayType = dayType;
		this.distance = distance;
		this.start = start;
		this.end = end;
		this.vehicle = vehicle;
	}

}