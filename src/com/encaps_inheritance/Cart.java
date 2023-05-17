package com.encaps_inheritance;

public class Cart extends Login {
private int Product_id;
public int getProduct_id() {
	return Product_id;
}
public void setProduct_id(int product_id) {
	Product_id = product_id;
}
public String getProduct_name() {
	return Product_name;
}
public void setProduct_name(String product_name) {
	Product_name = product_name;
}
private String Product_name;


public void cart() {
	System.out.println("Product_ID:"+Product_id);
	System.out.println("Product_name:"+Product_name);
}
}
