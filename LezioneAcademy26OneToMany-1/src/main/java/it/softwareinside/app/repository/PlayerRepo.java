package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareinside.app.models.Player;

public interface PlayerRepo extends JpaRepository<Player, String> {

}
