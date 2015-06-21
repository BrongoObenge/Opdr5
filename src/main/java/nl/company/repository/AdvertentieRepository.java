package nl.company.repository;

import nl.company.domain.Advertentie;

import org.springframework.data.repository.CrudRepository;

public interface AdvertentieRepository extends
		CrudRepository<Advertentie, Long> {

}
