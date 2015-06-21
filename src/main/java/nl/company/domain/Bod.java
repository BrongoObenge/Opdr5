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

import lombok.Data;

@Data
@Entity
public class Bod {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="prijs")
	private int prijs;
	
	@Column(name="datum")
	private Date date;
	
	@ManyToMany
	@JoinColumn(name="advertentie_id")
	List<Advertentie> advertentie;
	
	public Bod(int prijs, Advertentie a){
		this.prijs = prijs;
		this.date = new Date();
		this.addAdvertentie(a);
	}
	public void addAdvertentie(Advertentie a){
		this.advertentie.add(a);
	}
}
