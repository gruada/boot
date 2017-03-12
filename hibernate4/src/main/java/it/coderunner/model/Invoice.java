package it.coderunner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVOICE")
public class Invoice {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "wartosc")
	private int value;

	private String customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "id=" + id + ", value=" + value + ", customer=" + customer;
	}
}
