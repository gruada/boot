package it.coderunner.spring.data.dao;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import it.coderunner.spring.data.model.Departure;


public interface DepartureRepository extends CrudRepository<Departure, Long>{
	
	Page<Departure> findAll(Pageable pageable);

	List<Departure> findByTask(String task);

	
	@SuppressWarnings("unchecked")
	Departure save(Departure departure);

}
