package com.revature.ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Products {
	private int p_id;
	private int customer_id;
	private String productName;
	private String productDescription;
	private String imageUrl;
	private double price;
}
