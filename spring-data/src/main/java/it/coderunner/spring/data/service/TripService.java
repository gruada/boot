package it.coderunner.spring.data.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import it.coderunner.spring.data.model.Trip;

public interface TripService extends Serializable{


	List<Trip> findByLine(String line);
	
	Page<Trip> findAll(Pageable pageable);
	
	Trip save(Trip trip);

}
