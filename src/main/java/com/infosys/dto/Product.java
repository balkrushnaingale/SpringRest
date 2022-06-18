package com.infosys.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="prduct_tbl")
public class Product {
	@Id
	@Column(name="pid")
int prodId;
	@Column(name="pname",length=20)
String prodName;
	@Column(name="Pprice")
int prodPrice;
	@Column(name="Pqty")
int prodQty;
public Product() {
	super();
}
public Product(int prodId, String prod, int prodPrice, int prodQty) {
	super();
	this.prodId = prodId;
	this.prodName = prod;
	
	this.prodPrice = prodPrice;
	this.prodQty = prodQty;
}
public int getProdId() {
	return prodId;
}


public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProd() {
	return prodName;
}
public void setProd(String prod) {
	this.prodName = prod;
}
public int getProdPrice() {
	return prodPrice;
}
public void setProdPrice(int prodPrice) {
	this.prodPrice = prodPrice;
}
public int getProdQty() {
	return prodQty;
}
public void setProdQty(int prodQty) {
	this.prodQty = prodQty;
}
@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prod=" + prodName + ", prodPrice=" + prodPrice + ", prodQty=" + prodQty + "]";
}

}
