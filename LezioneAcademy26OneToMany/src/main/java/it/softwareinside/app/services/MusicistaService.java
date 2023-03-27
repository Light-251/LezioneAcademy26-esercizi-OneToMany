package it.softwareinside.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.app.models.Musicista;
import it.softwareinside.app.repository.MusicistaRepo;

@Service
public class MusicistaService {

	@Autowired
	MusicistaRepo musicistaRepo;

	public boolean addMusicista(Musicista musicista) {
		try {
			musicistaRepo.save(musicista);
			return true;
		} catch (Exception e) {
			System.err.println("Errore aggiunta musicista " + e);
			return false;
		}
	}

	public Musicista removeMusicista(String cognome) {
		try {
			Musicista musicistaRimosso = musicistaRepo.findById(cognome).get();
			musicistaRepo.deleteById(cognome);
			return musicistaRimosso;
		} catch (Exception e) {
			System.err.println("Errore rimozione musicista: " + e);
			return null;
		}

	}

	public List<Musicista> getAllMusicista() {
		try {
			return musicistaRepo.findAll();
		} catch (Exception e) {
			System.err.println("Errore get all musicisti " + e);
			return null;
		}

	}
}
