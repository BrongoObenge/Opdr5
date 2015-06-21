package nl.company.controller;

import java.util.List;

import nl.company.domain.Advertentie;
import nl.company.domain.AdvertentieReactie;
import nl.company.domain.Bod;
import nl.company.domain.Gebruiker;
import nl.company.service.AdvertentieService;
import nl.company.service.AdvertentieServiceImpl;
import nl.company.service.GebruikerService;
import nl.company.service.GebruikerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Scenario1 extends SomeBaseClass{
	@Autowired
	GebruikerService gebruikerService;
	
	@Autowired
	AdvertentieService adService;
	
	@RequestMapping("/scen1")
	public String scen1(){
		print("===================");
		print("Starting Scenario 1");
		//1
		Gebruiker gebruiker1 = new Gebruiker("voornaam", "achternaam", "email@gmail.com", "S3cret");
		Advertentie ad = new Advertentie("Te koop X", "Mooie X voor lage prijs" , 50);
		
		//2
		Gebruiker gebruiker2 = new Gebruiker("voornaam", "achternaam", "email@hotmail.com", "S3cret");
		Gebruiker gebruiker3 = new Gebruiker("voornaam", "achternaam", "email@yohoo.com", "S3cret");
		Gebruiker gebruiker4 = new Gebruiker("voornaam", "achternaam", "email@yahoo.com", "S3cret");
		
		gebruiker2.addBod(new Bod(55, ad));
		gebruiker3.addBod(new Bod(60, ad));
		gebruiker4.addBod(new Bod(65, ad));
		gebruiker2.addBod(new Bod(75, ad));
		
		//4
		ad.addReactie(gebruiker2.addReactie(new AdvertentieReactie("Mooie X!")));
		ad.addReactie(gebruiker1.addReactie(new AdvertentieReactie("Bedankt!")));
		ad.addReactie(gebruiker3.addReactie(new AdvertentieReactie("Ik heef je er een 10tje voor")));
		ad.addReactie(gebruiker1.addReactie(new AdvertentieReactie("Voor 500 euro mag je het vanavond komen ophalen.")));
		ad.addReactie(gebruiker4.addReactie(new AdvertentieReactie("Tering... Dat is duur!")));
		
		
		//Save ad + users
		this.saveGebruikers(gebruiker1, gebruiker2, gebruiker3, gebruiker4);
		this.saveAd(ad);
		return console;
	}
	private void saveGebruikers(Gebruiker...gebruikers){
		for(Gebruiker g : gebruikers){
			gebruikerService.save(g);
		}
	}
	private void saveAd(Advertentie...ad){
		for(Advertentie a: ad){
			adService.save(a);
		}
	}
	@Bean
	GebruikerService gebruikerService(){
		return new GebruikerServiceImpl();
	}
	
	@Bean
	AdvertentieService adService(){
		return new AdvertentieServiceImpl();
	}
	
}
