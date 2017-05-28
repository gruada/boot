package it.coderunner.spring.data.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.coderunner.spring.data.dao.DepartureRepository;
import it.coderunner.spring.data.dao.TripRepository;
import it.coderunner.spring.data.model.Departure;
import it.coderunner.spring.data.model.Trip;

@Service
public class DepartureServiceImpl implements DepartureService {

	private static final long serialVersionUID = -8657712695806050547L;

	@Resource
	private DepartureRepository DepartureRepository;

	@Override
	public List<Departure> findByTask(String task) {
		return DepartureRepository.findByTask(task);
	}

	@Override
	public Page<Departure> findAll(Pageable pageable) {
		return DepartureRepository.findAll(pageable);
	}
	
	@Override
	public Departure save(Departure departure) {
		return DepartureRepository.save(departure);
	}

}
