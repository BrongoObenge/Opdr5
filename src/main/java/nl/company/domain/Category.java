package nl.company.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="naam")
	private String naam;
	
	@ManyToMany
	@JoinColumn(name="advertentie_id")
	List<Advertentie> advertentie;
	
	public Category(String naam, Advertentie ad){
		this.naam = naam;
		this.addAdvertentie(ad);
	}
	public void addAdvertentie(Advertentie ad){
		this.advertentie.add(ad);
	}
}
