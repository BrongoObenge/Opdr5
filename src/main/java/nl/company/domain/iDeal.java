package nl.company.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
public class iDeal extends BetalingGegevens {
	@Column(name="verval_maand")
	private int vervalMaand;
	
	@Column(name="verval_jaar")
	private int vervalJaar;
	
	public iDeal(int vervalMaand, int vervalJaar){
		this.vervalJaar = vervalJaar;
		this.vervalMaand = vervalMaand;
	}
}
