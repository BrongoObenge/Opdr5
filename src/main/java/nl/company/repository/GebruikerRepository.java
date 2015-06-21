package nl.company.repository;

import nl.company.domain.Gebruiker;

import org.springframework.data.repository.CrudRepository;

public interface GebruikerRepository extends CrudRepository<Gebruiker, Long> {

}
