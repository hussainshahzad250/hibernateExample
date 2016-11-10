package com.lara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FromFileSystemManager11 
{
	public static void main(String[] args) 
	{
		/*Configuration c1 = new Configuration();
		c1.configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();*/
		Session s1 = Util.getSession();
		FileReader fin = null;
		BufferedReader bin=null;
		try
		{
			fin=new FileReader("data.txt");
			bin=new BufferedReader(fin);
			String row = bin.readLine();
			Order ord = null;
			s1.beginTransaction();
			String [] rowData;
			while(row!=null)
			{
				rowData=row.split(",");
				ord=new Order();
				ord.setOrderId(rowData[0].trim());
				ord.setCustomerName(rowData[1].trim());
				ord.setQuantity(Integer.parseInt(rowData[2].trim()));
				ord.setPrice(Integer.parseInt(rowData[3].trim()));
				s1.save(ord);
				row=bin.readLine();
			}
			s1.getTransaction().commit();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		}
		System.out.println("done");
	}
}
