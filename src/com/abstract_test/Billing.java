package com.abstract_test;

public class Billing extends Sellerinfo {
	public void billing_no(int bill_no) {
		System.out.println("bill number is :"+bill_no);
	}
	
	public void s_address(String city,int st_no,String St_name) {
		System.out.println("enter your city:"+city);
		System.out.println("enter your street number:"+st_no);
		System.out.println("enter your street name:"+St_name);}
	


	@Override
	public int sellerID(int sellerID) {
		System.out.println("seller id is :"+sellerID);
		return sellerID;
	}

	@Override
	public void s_name(String s_name) {
		// TODO Auto-generated method stub
		System.out.println("seller id is :"+s_name);
		
		
		
		
	}
	public static void main(String[] args) {
		Billing b=new Billing();
		b.s_address("montreal",123,"gvdfavfg");

	}
}
