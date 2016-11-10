package com.lara;

import org.hibernate.Session;

public class Manager8
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Order o1 = (Order) s1.load(Order.class, "ord201");
		System.out.println("---------");
		System.out.println(o1.getOrderId());
		System.out.println(o1.getCustomerName());
		System.out.println(o1.getQuantity());
		System.out.println(o1.getPrice());
		System.out.println("done");
		
	}

}
