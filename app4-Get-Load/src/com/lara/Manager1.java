package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/* Session s1 = Util.getSession(); */
		Configuration c1 = new Configuration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();

		Order o1 = new Order();
		o1.setOrderId("ord201");
		o1.setCustomerName("suman");
		o1.setQuantity(120);
		o1.setPrice(1000);

		Order o2 = new Order();
		o2.setOrderId("ord202");
		o2.setCustomerName("radha");
		o2.setQuantity(1200);
		o2.setPrice(2000);

		Transaction tx = s1.beginTransaction();
		s1.save(o1);
		s1.save(o2);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
