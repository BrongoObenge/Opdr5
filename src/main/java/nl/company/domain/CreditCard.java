package nl.company.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CreditCard extends BetalingGegevens{
	@Column(name="bank_naam")
	private String bankNaam;
}
