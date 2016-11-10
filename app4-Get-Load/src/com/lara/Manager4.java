package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager4 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		/*Configuration c1 = new Configuration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();*/
		
		Order ord = (Order) s1.load(Order.class, "ord202");
		Transaction tx = s1.beginTransaction();
		s1.delete(ord);
		tx.commit();
		System.out.println("done");
	}

}
