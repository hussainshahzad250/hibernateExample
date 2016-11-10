package com.lara;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager3 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Order  ord = (Order) s1.load(Order.class, "ord204");//this order not in db so give exception(ObjectNotFountException)
		ord.setPrice(200000);
		ord.setQuantity(40000);
		
		Transaction tx = s1.beginTransaction();
		s1.update(ord);
		tx.commit();
		System.out.println("done");
	}
}
