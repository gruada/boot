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

import it.coderunner.spring.data.model.Departure;
import it.coderunner.spring.data.service.DepartureService;

@Controller
public class DepartureController {

	@Autowired
	private DepartureService departureService;

	@GetMapping("/get/departure/{task}")
	public @ResponseBody ResponseEntity<String> getByTask(@PathVariable String task) {
		List<Departure> departures = departureService.findByTask(task);
		departures.stream().forEach(System.out::println);
		return departures != null && !departures.isEmpty() ? new ResponseEntity<String>("GET Response : " + departures, HttpStatus.OK)
				: new ResponseEntity<String>("No departure found", HttpStatus.NOT_FOUND);
	}


	@GetMapping("/get/all/departure/{page}/{size}")
	public @ResponseBody Page<Departure> getTop10(@PathVariable Integer page, @PathVariable Integer size) {
		return departureService.findAll(new PageRequest(page, size));
	}

}
