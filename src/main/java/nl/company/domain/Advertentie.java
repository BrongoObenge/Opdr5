package nl.company.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Advertentie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="naam")
	private String naam;
	
	@Column(name="beschrijving")
	private String beschrijving;
	
	@Column(name="start_prijs")
	private int startPrijs;
	
	@Column(name="actief")
	private Boolean actief;
	
	@Column(name="start_datum")
	private Date startDatum;
	
	@OneToMany
	@JoinColumn(name="reactie_id")
	List<AdvertentieReactie> reactie;
	
	@ManyToMany
	@JoinColumn(name="bod_id")
	List<Bod> bod;
	
	@ManyToMany
	@JoinColumn(name="category_id")
	List<Category> category;
	
	public Advertentie(String naam, String beschrijving, int startPrijs){
		this.naam = naam;
		this.beschrijving = beschrijving;
		this.startPrijs = startPrijs;
		this.actief = true;
		this.startDatum = new Date();
	}
	public void addReactie(AdvertentieReactie reactie){
		this.reactie.add(reactie);
	}
	public void addBod(Bod b){
		this.bod.add(b);
	}
	public void addCategory(Category cat){
		this.category.add(cat);
	}
}	
