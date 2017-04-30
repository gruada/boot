//package it.coderunner.spring.data.service;
//
//import java.io.Serializable;
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import it.coderunner.spring.data.model.Variant;
//
//public interface CityService extends Serializable{
//
//	Variant findByNameAndCountryAllIgnoringCase(String name, String country);
//
//	Variant save(Variant city);
//	
//	List<Variant> findFirst10ByCountry(String country);
//	
//	Page<Variant> findAll(Pageable pageable);
//
//}
