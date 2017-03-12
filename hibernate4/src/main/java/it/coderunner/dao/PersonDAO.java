package it.coderunner.dao;

import java.util.List;

import it.coderunner.model.Person;

public interface PersonDAO {

	Person save(Person p);
	
	List<Person> list();
	
	Person selectById (int id);
	
	Person update(Person p);
	
}
