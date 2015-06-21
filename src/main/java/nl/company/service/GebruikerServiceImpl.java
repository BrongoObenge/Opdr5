package nl.company.service;

import javax.annotation.Resource;

import nl.company.domain.Gebruiker;
import nl.company.repository.GebruikerRepository;

public class GebruikerServiceImpl implements GebruikerService{
	@Resource
	private GebruikerRepository gebruikerRepo;

	@Override
	public void save(Gebruiker g) {
		gebruikerRepo.save(g);
	}
}
