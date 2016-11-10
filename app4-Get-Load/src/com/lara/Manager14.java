package com.lara;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

import org.hibernate.Session;

public class Manager14
{
	public static void main(String[] args) throws Throwable 
	{
		Session s1 = Util.getSession();
		FileReader fin = new FileReader("data.txt");
		Scanner sc=new Scanner(fin);
		Order ord=null;
		while(sc.hasNext())
		{
			ord=new Order();
			String sa=(sc.nextLine());
			String []s=sa.split(", ");
			System.out.println(Arrays.toString(s));
			ord.setOrderId("ord101");
			ord.setCustomerName("vijay");
			ord.setQuantity(40);
			ord.setPrice(10000);
			System.out.println(sc.next());
		}
				
			/*BufferedReader b1 = new BufferedReader(fin);
			String row = b1.readLine();
			String[] cols;
			while(row != null)
			{
				cols= row.split(",");
				System.out.println();
			}*/
			
	}
}
	

