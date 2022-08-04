package com.revature.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Products {
	private int p_id;
	private double p_price;
	private String prodName;
	private String prodDesc;
	private String prod_img;
	private int u_id;
	private int o_id;
	public products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public products(int p_id, double p_price, String prodName, String prodDesc, String prod_img, int u_id, int o_id) {
		super();
		this.p_id = p_id;
		this.p_price = p_price;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prod_img = prod_img;
		this.u_id = u_id;
		this.o_id = o_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getProd_img() {
		return prod_img;
	}
	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	@Override
	public String toString() {
		return "products [p_id=" + p_id + ", p_price=" + p_price + ", prodName=" + prodName + ", prodDesc=" + prodDesc
				+ ", prod_img=" + prod_img + ", u_id=" + u_id + ", o_id=" + o_id + "]";
	}
}
