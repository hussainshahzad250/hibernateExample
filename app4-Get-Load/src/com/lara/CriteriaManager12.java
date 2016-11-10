package com.lara;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
public class CriteriaManager12 
{
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Session s1=Util.getSession();
		Criteria ctr=s1.createCriteria(Order.class);
		List<Order> orders=ctr.list();	
		for(Order order : orders)
		{
			System.out.print(order.getOrderId() + ", ");
			System.out.print(order.getCustomerName() + ", ");
			System.out.print(order.getPrice() + ", ");
			System.out.println(order.getQuantity() + ", ");
			System.out.println("-------------------------");
		}
	}
}
