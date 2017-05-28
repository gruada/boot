package it.coderunner.spring.data.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import it.coderunner.spring.data.model.Stop;

public interface StopRepository extends CrudRepository<Stop, Long>{
	
	Page<Stop> findAll(Pageable pageable);

	List<Stop> findByStopName(String stopName);

		
	@SuppressWarnings("unchecked")
	Stop save(Stop stop);

}
