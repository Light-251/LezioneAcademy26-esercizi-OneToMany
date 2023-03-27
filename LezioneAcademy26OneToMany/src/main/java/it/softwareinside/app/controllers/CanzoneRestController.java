package it.softwareinside.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.app.models.Canzone;
import it.softwareinside.app.services.CanzoneService;

@RequestMapping("/api/canzone")
@RestController
public class CanzoneRestController {
	@Autowired
	CanzoneService canzoneService;
	
	@PostMapping("/add")
	public boolean addCanzone(@RequestBody Canzone canzone) {
		return canzoneService.addCanzone(canzone);
	}
	
	@DeleteMapping("/remove-by-id")
	public Canzone removeCanzone(@RequestParam("id")String titolo) {
		return canzoneService.removeCanzone(titolo);
	}
	
	@GetMapping("/get-all")
	public List<Canzone> getAllCanzone(){
		return canzoneService.getAllCanzone();
		
	}
}
