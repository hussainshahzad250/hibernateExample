package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadManager2 
{
	public static void main(String[] args) 
	{
		Configuration c1 = new Configuration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		//Session s1 = Util.getSession();
		Order obj = (Order) s1.load(Order.class, "ord201");
		System.out.println();
		System.out.println("Order id = " + obj.getOrderId());
		System.out.println("Name of customer = " + obj.getCustomerName() );
		System.out.println("Quantity = " + obj.getQuantity() );
		System.out.println("Price = " + obj.getPrice() );
		System.out.println();
	}
}
