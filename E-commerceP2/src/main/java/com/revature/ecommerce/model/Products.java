package com.revature.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Products {
	@Id
	@GeneratedValue
	private int p_id;
	private double p_price;
	private String prodName;
	private String prodDesc;
	private String prod_img;
	private int u_id;
	private int o_id;
}
