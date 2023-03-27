package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareinside.app.models.Team;

public interface TeamRepo extends JpaRepository<Team, String> {

}
