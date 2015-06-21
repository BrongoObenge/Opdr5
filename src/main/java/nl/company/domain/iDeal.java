package nl.company.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class iDeal extends BetalingGegevens {
	@Column(name="verval_maand")
	private int vervalMaand;
	@Column(name="verval_jaar")
	private int vervalJaar;
}
