package it.softwareinside.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.app.models.Team;
import it.softwareinside.app.repository.TeamRepo;

@Service
public class TeamService {

	@Autowired
	TeamRepo teamRepo;

	public boolean addTeam(Team team) {
		try {
			teamRepo.save(team);
			return true;
		} catch (Exception e) {
			System.err.println(("Errore aggiunta team " + e));
			return false;
		}
	}

	public List<Team> getAll() {
		try {
			return teamRepo.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	public Team removeById(String nome) {
		try {
			Team teamTmp = teamRepo.findById(nome).get();
			teamRepo.deleteById(nome);
			return teamTmp;
		} catch (Exception e) {
			System.err.println("Errore rimozione by id: " + e);
			return null;
		}

	}
}
