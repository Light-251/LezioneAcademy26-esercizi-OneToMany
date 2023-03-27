package it.softwareinside.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.app.models.Allenatore;
import it.softwareinside.app.services.AllenatoreService;

@RequestMapping("/api/allenatore")
@RestController
public class AllenatoreRestController {

	@Autowired
	AllenatoreService allenatoreService;

	@PostMapping("/add")
	public boolean addAllenatore(@RequestBody Allenatore allenatore) {
		return allenatoreService.addAllenatore(allenatore);
	}

	@GetMapping("/list")
	public List<Allenatore> getAll() {
		return allenatoreService.getAllenatore();
	}

	@DeleteMapping("/delete-by-id")
	public Allenatore removeAllenatore(@RequestParam(value = "id") String cognome) {
		return allenatoreService.removeById(cognome);
	}
}
