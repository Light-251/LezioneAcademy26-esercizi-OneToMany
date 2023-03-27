package it.softwareinside.app.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {
	@Id
	private String nome;

	@NotNull
	private Integer trofeiVinti;

	@OneToOne(cascade = CascadeType.ALL)
	private Allenatore allenatore;

	@OneToMany(cascade = CascadeType.ALL)
	private Player[] players;
}
