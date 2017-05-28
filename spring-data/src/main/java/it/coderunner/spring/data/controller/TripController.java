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

import it.coderunner.spring.data.model.Trip;
import it.coderunner.spring.data.service.TripService;

@Controller
public class TripController {

	@Autowired
	private TripService tripService;

	@GetMapping("/get/trip/{line}")
	public @ResponseBody ResponseEntity<String> getByLine(@PathVariable String line) {
		List<Trip> trips = tripService.findByLine(line);
		trips.stream().forEach(System.out::println);
		return trips != null && !trips.isEmpty() ? new ResponseEntity<String>("GET Response : " + trips, HttpStatus.OK)
				: new ResponseEntity<String>("No trip found", HttpStatus.NOT_FOUND);
	}


	@GetMapping("/get/all/trip/{page}/{size}")
	public @ResponseBody Page<Trip> getTop10(@PathVariable Integer page, @PathVariable Integer size) {
		return tripService.findAll(new PageRequest(page, size));
	}

}
