package it.coderunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.coderunner.dao.InvoiceDAO;
import it.coderunner.dao.PersonDAO;
import it.coderunner.model.Invoice;
import it.coderunner.model.Person;

public class SpringHibernateMain {

	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		PersonDAO personDAO = context.getBean(PersonDAO.class);
		InvoiceDAO invoiceDAO = context.getBean(InvoiceDAO.class);

		int id =1 ;
		Person person = personDAO.selectById(id);		
		person.setName("Krzysiek");
		person.setCountry("Poland");

		person = personDAO.update(person);

		System.out.println("Person::" + person);

		personDAO.list().forEach(System.out::println);

		
	
		context.close();

	}

}
