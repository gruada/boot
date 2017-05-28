package it.coderunner.spring.data.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.coderunner.spring.data.dao.TripRepository;
import it.coderunner.spring.data.dao.VehicleRepository;
import it.coderunner.spring.data.model.Trip;
import it.coderunner.spring.data.model.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

	private static final long serialVersionUID = -8657712695806050547L;

	@Resource
	private VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> findByType(String type) {
		return vehicleRepository.findByType(type);
	}

	@Override
	public Page<Vehicle> findAll(Pageable pageable) {
		return vehicleRepository.findAll(pageable);
	}

	@Override
	public Vehicle save(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

}
