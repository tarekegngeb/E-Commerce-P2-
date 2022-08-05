package com.revature.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString

public class BillingAddress {

    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String city;
    private String state;
    private int zip;

    @OneToOne(mappedBy = "billingAddress")
    private Customer customer;

	public BillingAddress(String street, String city, String state, int zip, Customer customer) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.customer = customer;
	}
    
    

}
