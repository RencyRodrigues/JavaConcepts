package com.encaps_inheritance;

public class Main {

	public static void main(String[] args) {
		//Login l=new Login();
		Cart c=new Cart();
//l.setUsername("John");
//l.setPassword("1234");
c.setProduct_id(12);
c.setProduct_name("chocolate");
c.setUsername("john");
c.setPassword("12344");

c.login();
c.cart();
//l.login();
	}

}
