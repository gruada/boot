package it.coderunner.spring.data.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import it.coderunner.spring.data.model.Car;

public interface CarService extends Serializable{

	Car findByModelAndColorAllIgnoringCase(String model, String color);

	Car save(Car car);
	
	List<Car> findFirst10ByColor(String color);
	
	List<Car> findByRegDateBetween(Date dateStart, Date dateEnd);
	
	Page<Car> findAll(Pageable pageable);

}
