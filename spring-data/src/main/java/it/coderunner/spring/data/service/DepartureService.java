package it.coderunner.spring.data.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import it.coderunner.spring.data.model.Departure;

public interface DepartureService extends Serializable{


	List<Departure> findByTask(String task);
	
	Page<Departure> findAll(Pageable pageable);
	
	Departure save(Departure departure);

}
