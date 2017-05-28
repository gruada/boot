package it.coderunner.spring.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import it.coderunner.spring.data.model.Vehicle;
import it.coderunner.spring.data.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@GetMapping("/get/vehicle/{type}")
	public @ResponseBody ResponseEntity<String> getByType(@PathVariable String type) {
		List<Vehicle> vehicles = vehicleService.findByType(type);
		vehicles.stream().forEach(System.out::println);
		return vehicles != null && !vehicles.isEmpty() ? new ResponseEntity<String>("GET Response : " + vehicles, HttpStatus.OK)
				: new ResponseEntity<String>("No vehicle found", HttpStatus.NOT_FOUND);
	}


	@GetMapping("/get/all/vehicle/{page}/{size}")
	public @ResponseBody Page<Vehicle> getTop10(@PathVariable Integer page, @PathVariable Integer size) {
		return vehicleService.findAll(new PageRequest(page, size));
	}

}
