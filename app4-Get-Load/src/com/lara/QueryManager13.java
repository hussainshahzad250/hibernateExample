package com.lara;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class QueryManager13 
{
	public static void main(String[] args) 
	{
		Session s1=Util.getSession();
		Query qry =s1.createQuery("from Order");
		List<Order> orders=qry.list();
		
		for(Order order : orders)
		{
			System.out.print(order.getOrderId() + ", ");
			System.out.print(order.getCustomerName() + ", ");
			System.out.print(order.getPrice() + ", ");
			System.out.println(order.getQuantity() + ", ");
			System.out.println("=========================");
		}
	}
}
