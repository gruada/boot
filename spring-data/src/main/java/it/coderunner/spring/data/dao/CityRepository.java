package it.coderunner.spring.data.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import it.coderunner.spring.data.model.Variant;

public interface CityRepository extends CrudRepository<Variant, Long>{
	
	Page<Variant> findAll(Pageable pageable);

	Page<Variant> findByNameContainingAndCountryContainingAllIgnoringCase(String name,
			String country, Pageable pageable);

	Variant findByNameAndCountryAllIgnoringCase(String name, String country);
	
	List<Variant> findFirst10ByCountry(String country);
	
	@SuppressWarnings("unchecked")
	Variant save(Variant city);

}
