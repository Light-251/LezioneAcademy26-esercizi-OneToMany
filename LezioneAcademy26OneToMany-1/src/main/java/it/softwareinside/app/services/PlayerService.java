package it.softwareinside.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.softwareinside.app.models.Player;
import it.softwareinside.app.repository.PlayerRepo;

@Service
public class PlayerService {
	@Autowired
	PlayerRepo playerRepo;

	public boolean addPlayer(Player player) {
		try {
			playerRepo.save(player);
			return true;
		} catch (Exception e) {
			System.err.println("Errore aggiunta team: " + e);
			return false;
		}
	}

	public List<Player> getAll() {
		try {
			return playerRepo.findAll();
		} catch (Exception e) {
			System.err.println(("Errore lista giocatori " + e));
			return null;
		}
	}

	public Player deleteById(String cognome) {
		try {
			Player playerTmp = playerRepo.findById(cognome).get();
			playerRepo.deleteById(cognome);
			return playerTmp;
		} catch (Exception e) {
			System.err.println(("Errore rimozione by id giocatore: " + e));
			return null;
		}

	}
}
