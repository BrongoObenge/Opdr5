package nl.company.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class AdvertentieReactie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="text")
	private String text;
	
	@Column(name="datum")
	private Date datum;
	
	public AdvertentieReactie(String text){
		this.text = text;
		this.datum = new Date();
	}
}
