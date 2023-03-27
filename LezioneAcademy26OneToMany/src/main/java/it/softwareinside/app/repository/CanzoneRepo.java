package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.softwareinside.app.models.Canzone;

public interface CanzoneRepo extends JpaRepository<Canzone, String>{

}
