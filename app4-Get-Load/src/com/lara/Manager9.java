package com.lara;

import org.hibernate.Session;

public class Manager9 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Order ord = (Order) s1.get(Order.class, "ord201");
		System.out.println("---------");
		System.out.print(ord.getOrderId() + ", ");
		System.out.print(ord.getCustomerName() + ", ");
		System.out.print(ord.getQuantity() + ", ");
		System.out.println(ord.getPrice() + ", ");
		System.out.println("done");		
	}
}
