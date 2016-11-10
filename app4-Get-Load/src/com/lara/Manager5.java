package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager5 
{

	public static void main(String[] args) 
	{
		Session s2 = Util.getSession();
		Order ord = new Order();
		ord.setOrderId("ord104");
		ord.setCustomerName("Shahzad");
		ord.setQuantity(10000);
		ord.setPrice(22);
		
		Transaction tx = s2.beginTransaction();
		s2.save(ord);
		tx.commit();
		s2.flush();
		s2.close();
		System.out.println("done");
	}
}
