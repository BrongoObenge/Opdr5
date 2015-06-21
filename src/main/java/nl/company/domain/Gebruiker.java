package nl.company.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Gebruiker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="voornaam")
	private String voornaam;
	
	@Column(name="achternaam")
	private String achternaam;
		
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="wachtwoord")
	private String wachtwoord;
	
	@OneToMany
	@JoinColumn(name="bod_id")
	List<Bod> bod;
	
	@OneToMany
	@JoinColumn(name="reactie_id")
	List<AdvertentieReactie> reactie;
	
	@OneToOne
	@JoinColumn(name="betaling_id")
	BetalingGegevens betaling;
	
	public Gebruiker(String voornaam, String achternaam, String email, String wachtwoord){
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.email = email;
		this.wachtwoord = wachtwoord;
	}
	public Bod addBod(Bod bod){
		this.bod.add(bod);
		return bod;
	}
	public AdvertentieReactie addReactie(AdvertentieReactie reactie){
		this.reactie.add(reactie);
		return reactie;
	}
	
}
