package it.coderunner.spring.data.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import it.coderunner.spring.data.model.Vehicle;

public interface VehicleService extends Serializable{


	List<Vehicle> findByType(String type);
	
	Page<Vehicle> findAll(Pageable pageable);
	
	Vehicle save(Vehicle vehicle);

}
