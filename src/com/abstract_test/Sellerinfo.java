package com.abstract_test;

public abstract class Sellerinfo {
	
	
	abstract public int sellerID(int sellerID);
	abstract public void s_name(String s_name);
	public void s_address(String city,int st_no,String St_name) {
		System.out.println("enter your city:"+city);
		System.out.println("enter your street number:"+st_no);
		System.out.println("enter your street name:"+St_name);
		
		
	}
	
	
	


}
