package com.lara;

public class Order 
{
	private  String OrderId;
	private String CustomerName;
	private int Quantity;
	private int price;
	
	public void setOrderId(String orderId)
	{
		OrderId = orderId;
	}
	public String getOrderId()
	{
		return OrderId;
	}
	public void setCustomerName(String customerName)
	{
		CustomerName = customerName;
	}
	public String getCustomerName()
	{
		return CustomerName;
	}
	public void setQuantity(int quantity)
	{
		Quantity = quantity;
	} public int getQuantity()
	{
		return Quantity;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
}
