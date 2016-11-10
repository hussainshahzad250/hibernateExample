package com.lara;

import org.hibernate.Session;

public class Manager7 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		//Session s1 = (Session) Util.getSession();
		Order o1 = (Order) s1.load(Order.class, "ord201");
		System.out.println("========");
		System.out.println("ID = " + o1.getOrderId());
		System.out.println("Name = " + o1.getCustomerName());
		System.out.println("Quantity = " + o1.getQuantity());
		System.out.println("Price = " + o1.getPrice());
		System.out.println("done");
		
	}

}
