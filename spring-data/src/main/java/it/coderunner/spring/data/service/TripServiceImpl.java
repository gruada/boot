package it.coderunner.spring.data.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.coderunner.spring.data.dao.TripRepository;
import it.coderunner.spring.data.model.Trip;

@Service
public class TripServiceImpl implements TripService {

	private static final long serialVersionUID = -8657712695806050547L;

	@Resource
	private TripRepository tripRepository;

	@Override
	public List<Trip> findByLine(String line) {
		return tripRepository.findByLine(line);
	}

	@Override
	public Page<Trip> findAll(Pageable pageable) {
		return tripRepository.findAll(pageable);
	}

	@Override
	public Trip save(Trip trip) {
		return tripRepository.save(trip);
	}

}
