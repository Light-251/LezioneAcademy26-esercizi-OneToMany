package it.softwareinside.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.softwareinside.app.models.Allenatore;
import it.softwareinside.app.repository.AllenatoreRepo;

@Service
public class AllenatoreService {

	@Autowired
	AllenatoreRepo allenatoreRepo;

	public boolean addAllenatore(Allenatore allenatore) {
		try {
			allenatoreRepo.save(allenatore);
			return true;
		} catch (Exception e) {
			System.err.println(("Errore aggiunta allenatore: " + e));
			return false;
		}

	}

	public List<Allenatore> getAllenatore() {
		try {
			return allenatoreRepo.findAll();
		} catch (Exception e) {
			System.err.println(("Errore lista allenatori " + e));
			return null;
		}
	}

	public Allenatore removeById(String cognome) {
		try {
			Allenatore allenatoreTmp = allenatoreRepo.findById(cognome).get();
			allenatoreRepo.deleteById(cognome);
			return allenatoreTmp;
		} catch (Exception e) {
			System.err.println("Errore rimozione allenatore " + e);
			return null;
		}
	}

}
