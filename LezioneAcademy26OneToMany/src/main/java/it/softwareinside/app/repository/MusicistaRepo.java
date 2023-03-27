package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.softwareinside.app.models.Musicista;

public interface MusicistaRepo extends JpaRepository<Musicista, String>{

}
