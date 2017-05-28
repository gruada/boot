package it.coderunner.spring.data.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import it.coderunner.spring.data.model.Stop;

public interface StopService extends Serializable{


	List<Stop> findByStopName(String stopName);
	
	Page<Stop> findAll(Pageable pageable);
	
	Stop save(Stop stop);

}
