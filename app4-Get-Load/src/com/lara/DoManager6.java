package com.lara;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DoManager6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Session s1 = Util.getSession();
		//Order ord = null;
		Transaction tx = s1.beginTransaction();
		do
		{
			Order ord = new Order();
			//ord = new Order();
			System.out.println("enter id");
			ord.setOrderId(sc.next());
			System.out.println("enter Customer Name");
			ord.setCustomerName(sc.next());
			System.out.println("enter Quantity");
			ord.setQuantity(Integer.parseInt(sc.next()));
			System.out.println("enter price");
			ord.setPrice(Integer.parseInt(sc.next()));
			s1.save(ord);
			System.out.println("do you want one more?(y/n)");
		}
		while("y".equals(sc.next()));
		{
			tx.commit();
			System.out.println("done");
		}		
	}
}
