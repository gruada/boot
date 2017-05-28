package it.coderunner.spring.data.dao;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import it.coderunner.spring.data.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long>{
	
	Page<Vehicle> findAll(Pageable pageable);

	List<Vehicle> findByType(String type);

	
	@SuppressWarnings("unchecked")
	Vehicle save(Vehicle vehicle);

}
