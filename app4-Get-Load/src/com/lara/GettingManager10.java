package com.lara;

import org.hibernate.Session;

public class GettingManager10
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Order ord = (Order) s1.get(Order.class, "ord501");
		System.out.println("---------");
		System.out.println(ord.getOrderId());
		System.out.println(ord.getCustomerName());
		System.out.println(ord.getQuantity());
		System.out.println(ord.getPrice());
		System.out.println("done");		
	}
}
