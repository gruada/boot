package it.coderunner.spring.data.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Car implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 5711651958724442355L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private String color;
	
	@Column(name="reg_date")
	private Date regDate;
	
	public Car(String model, String color, Date regDate){
		this.model = model;
		this.color = color;
		this.regDate = regDate;
	}

}