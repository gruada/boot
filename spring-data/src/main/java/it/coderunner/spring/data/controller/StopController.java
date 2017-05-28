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

import it.coderunner.spring.data.model.Stop;
import it.coderunner.spring.data.service.StopService;

@Controller
public class StopController {

	@Autowired
	private StopService stopService;

	@GetMapping("/get/stop/{stopName}")
	public @ResponseBody ResponseEntity<String> getByStopName(@PathVariable String stopName) {
		List<Stop> stops = stopService.findByStopName(stopName);
		stops.stream().forEach(System.out::println);
		return stops != null && !stops.isEmpty() ? new ResponseEntity<String>("GET Response : " + stops, HttpStatus.OK)
				: new ResponseEntity<String>("No stop found", HttpStatus.NOT_FOUND);
	}


	@GetMapping("/get/all/stop/{page}/{size}")
	public @ResponseBody Page<Stop> getTop10(@PathVariable Integer page, @PathVariable Integer size) {
		return stopService.findAll(new PageRequest(page, size));
	}

}
