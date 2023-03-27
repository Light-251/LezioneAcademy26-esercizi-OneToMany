package it.softwareinside.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import it.softwareinside.app.models.Player;
import it.softwareinside.app.services.PlayerService;

@RequestMapping("/api/player")
@RestController
public class PlayerRestController {

	@Autowired
	PlayerService playerService;

	@PostMapping("/add")
	public boolean addPlayer(Player player) {
		return playerService.addPlayer(player);
	}

	@GetMapping("/lsit")
	public List<Player> getAllPlayer() {
		return playerService.getAll();
	}

	@DeleteMapping("/remove")
	public Player removePlayer(@RequestParam(value = "id") String cognome) {
		return playerService.deleteById(cognome);
	}
}
