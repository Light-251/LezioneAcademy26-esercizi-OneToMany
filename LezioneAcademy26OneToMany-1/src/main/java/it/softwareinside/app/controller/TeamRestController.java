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

import it.softwareinside.app.models.Team;
import it.softwareinside.app.services.TeamService;

@RequestMapping("/api/team")
@RestController
public class TeamRestController {

	@Autowired
	TeamService teamService;

	@PostMapping("/add")
	public boolean addTeam(@RequestBody Team team) {
		return teamService.addTeam(team);
	}

	@GetMapping("/list")
	public List<Team> getTeam() {
		return teamService.getAll();
	}

	@DeleteMapping("/delete-by-id")
	public Team removeTeam(@RequestParam(value = "id") String nome) {
		return teamService.removeById(nome);
	}
}
