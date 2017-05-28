package it.coderunner.spring.data.dao;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import it.coderunner.spring.data.model.Trip;

public interface TripRepository extends CrudRepository<Trip, Long>{
	
	Page<Trip> findAll(Pageable pageable);

	List<Trip> findByLine(String line);

	
	@SuppressWarnings("unchecked")
	Trip save(Trip trip);

}
