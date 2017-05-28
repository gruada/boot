package it.coderunner.spring.data.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.coderunner.spring.data.dao.StopRepository;
import it.coderunner.spring.data.dao.TripRepository;
import it.coderunner.spring.data.model.Stop;
import it.coderunner.spring.data.model.Trip;

@Service
public class StopServiceImpl implements StopService {

	private static final long serialVersionUID = -8657712695806050547L;

	@Resource
	private StopRepository stopRepository;

	@Override
	public List<Stop> findByStopName(String stopName) {
		return stopRepository.findByStopName(stopName);
	}

	@Override
	public Page<Stop> findAll(Pageable pageable) {
		return stopRepository.findAll(pageable);
	}

	@Override
	public Stop save(Stop stop) {
		return stopRepository.save(stop);
	}

}
