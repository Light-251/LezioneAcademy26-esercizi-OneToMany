package it.softwareinside.app.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Musicista {
	@Id
	private String cognome;
	@NotNull
	private Integer eta;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Canzone> canzoni;

}
