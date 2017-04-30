//package it.coderunner.spring.data.dao;
//
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
//
//import it.coderunner.spring.data.model.Car;
//
//public interface CarRepository extends CrudRepository<Car, Long>{
//	
//	Page<Car> findAll(Pageable pageable);
//
//	Page<Car> findByModelContainingAndColorContainingAllIgnoringCase(String model,
//			String color, Pageable pageable);
//
//	Car findByModelAndColorAllIgnoringCase(String model, String color);
//	
//	List<Car> findFirst10ByColor(String color);
//	
//	List<Car> findByRegDateBetween(Date dateStart, Date dateEnd);
//	
//	@SuppressWarnings("unchecked")
//	Car save(Car car);
//
//}
