package com.revature.ecommerce.models;

import java.time.LocalDate;

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

public class Orders {
	private int order_id;
	private LocalDate orderDate;
	private String order_status;
	private int product_id;
	private int customer_id;
}
