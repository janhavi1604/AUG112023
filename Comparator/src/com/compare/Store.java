package com.compare;
import java.util.*;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> arraylist=new ArrayList<>();
		arraylist.add(new Customer("Peter","New","Mumbai",300));
		arraylist.add(new Customer("Sam","Old","Pune",250));
		arraylist.add(new Customer("John","New","Delhi",150));
		arraylist.add(new Customer("Carn","Old","Chennai",100));
		
		//arraylist.sort((i,j)->i.getCustomerName().compareTo(j.getCustomerName()));
		//arraylist.forEach(System.out::println);
		
		arraylist.removeIf((i)->i.getPlanAmount()<200);
		arraylist.forEach(System.out::println);

	}

}
