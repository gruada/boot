package it.coderunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.coderunner.dao.InvoiceDAO;
import it.coderunner.model.Invoice;


public class SpringHibernateMainInvoice {

	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		InvoiceDAO invoiceDAO = context.getBean(InvoiceDAO.class);

		Invoice invoice = new Invoice();
		invoice.setValue(1000);
	

		invoiceDAO.save(invoice);

		System.out.println("Invoice::" + invoice);

		invoiceDAO.list().forEach(System.out::println);

		context.close();

	}

}
