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
import it.softwareinside.app.models.Musicista;
import it.softwareinside.app.services.MusicistaService;

@RequestMapping("/api/musicista")
@RestController
public class MusicistaRestController {
	
	@Autowired
	MusicistaService musicistaService;
	
	@PostMapping("/add")
	public boolean addMusicista(@RequestBody Musicista musicista) {
		return musicistaService.addMusicista(musicista);
	}
	
	@DeleteMapping("/remove-by-id")
	public Musicista removeMusicista(@RequestParam("id")String cognome) {
		return musicistaService.removeMusicista(cognome);
	}
	
	@GetMapping("/get-all")
	public List<Musicista> getAllMusicista(){
		return musicistaService.getAllMusicista();
	}

}
