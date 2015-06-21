package nl.company.service;

import javax.annotation.Resource;

import nl.company.domain.Advertentie;
import nl.company.repository.AdvertentieRepository;

public class AdvertentieServiceImpl implements AdvertentieService{
	@Resource
	AdvertentieRepository adRepo;

	@Override
	public void save(Advertentie ad) {
		adRepo.save(ad);
	}
	
	
	
}
