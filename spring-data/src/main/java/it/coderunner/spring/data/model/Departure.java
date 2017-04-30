package it.coderunner.spring.data.model;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Departure implements Serializable {


	private static final long serialVersionUID = 5711651958724442355L;

	@Id 
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String task;

	@Column(name="stop_number", nullable = false)
	private int stopNumber;
	
	@ManyToOne
	@JoinColumn(name="stop_id", nullable = false)
	private Stop stop;
	
	@Column(nullable = false)
	private String time;	
	
	@ManyToOne
	@JoinColumn(name="trip_id", nullable = false)
	private Trip trip;
	
	public Departure(String task, int stopNumber, Stop stop, String time, Trip trip){
		this.task = task;
		this.stopNumber = stopNumber;
		this.stop = stop;
		this.time = time;
		this.trip = trip;
	}

}