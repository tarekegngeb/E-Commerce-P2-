package com.revature.ecommerce.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CartItem {
	
	private int id;
	private int quantity;
	private double price;
}
