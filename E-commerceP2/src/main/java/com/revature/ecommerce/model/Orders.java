package com.revature.ecommerce.model;

import java.time.LocalDate;

import javax.persistence.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Orders {
	private int order_id;
	private int num_items;
	private int p_id;
	private int u_id;
	private LocalDate dTime_order;
	
}
