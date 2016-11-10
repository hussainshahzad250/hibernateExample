package com.lara;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Util 
{
	private static SessionFactory sf;
	static
	{
		Configuration c1 = new Configuration().configure();
		sf = c1.buildSessionFactory();
	}
	public static Session getSession() 
	{
		return sf.openSession();	
	}
}
