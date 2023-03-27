package it.softwareinside.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.softwareinside.app.models.Canzone;
import it.softwareinside.app.repository.CanzoneRepo;

@Service
public class CanzoneService {

	@Autowired
	CanzoneRepo canzoneRepo;
	
	public boolean addCanzone(Canzone canzone) {
		try {
			canzoneRepo.save(canzone);
			return true;
		} catch (Exception e) {
			System.err.println("Errore aggiunta canzone");
			return false;
		}
	}
	
	public Canzone removeCanzone(String titolo) {
		try {
			Canzone canzoneRimossa = canzoneRepo.findById(titolo).get();
			canzoneRepo.deleteById(titolo);
			return canzoneRimossa;
		} catch (Exception e) {
			System.err.println("Errore rimozione canzone: " + e);
			return null;
		}
		
	}
	
	public List<Canzone> getAllCanzone() {
		try {
			return canzoneRepo.findAll();
		} catch (Exception e) {
			System.err.println("Errore get all canzoni " + e);
			return null;
		}
		
	}
}
