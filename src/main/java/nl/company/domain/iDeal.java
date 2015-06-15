package nl.company.domain;

import lombok.Data;

@Data
public class iDeal extends BetalingGegevens {
	private int vervalMaand;
	private int vervalJaar;
}
