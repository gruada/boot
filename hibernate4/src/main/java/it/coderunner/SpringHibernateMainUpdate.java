package it.coderunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.coderunner.dao.InvoiceDAO;
import it.coderunner.dao.PersonDAO;
import it.coderunner.model.Invoice;
import it.coderunner.model.Person;

public class SpringHibernateMainUpdate {

	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		PersonDAO personDAO = context.getBean(PersonDAO.class);

		Person person = new Person();
		person.setName("Michał");
		person.setCountry("Poland");

		person = personDAO.save(person);

		System.out.println("Person::" + person);

		personDAO.list().forEach(System.out::println);

		

		InvoiceDAO invoiceDAO = context.getBean(InvoiceDAO.class);

		Invoice invoice = new Invoice();
		invoice.setValue(1000);

		invoice.setPerson(person);
	

		invoiceDAO.save(invoice);

		System.out.println("Invoice::" + invoice);

		invoiceDAO.list().forEach(System.out::println);
		
		
		
		context.close();

	}

}
