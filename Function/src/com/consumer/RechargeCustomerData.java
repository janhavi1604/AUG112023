package com.consumer;

import java.util.ArrayList;
import java.util.function.Function;
public class RechargeCustomerData {
ArrayList<Recharge> itemList=new ArrayList<>();
	
	    RechargeCustomerData()
	{
		itemList.add(new Recharge("1","250","11/08/23"));
		itemList.add(new Recharge("2","251","23/10/2023"));
		itemList.add(new Recharge("3","250","25/10/23"));
		itemList.add(new Recharge("4","120","30/10/23"));
		
	}
	    
	    public void forEach(Function<Recharge,String> function)
	    {
	    	for(Recharge i:itemList)
	    	{
	    		System.out.println(function.apply(i));
	    	}
	    		
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RechargeCustomerData obj =new RechargeCustomerData();
		
		obj.forEach((e)->e.getCustomerId());
		obj.forEach((e)->e.getAmount());
		
		
		
	}

}
