package com.mypac;

import java.util.function.Consumer;
import java.util.function.Predicate;



import java.util.ArrayList;
import java.util.Arrays;



public class CandidateDemo {
	
	ArrayList<Candidate> itemList=new ArrayList<>();
	
	CandidateDemo()
	{
		itemList.add(new Candidate(20));
		itemList.add(new Candidate(15));
		itemList.add(new Candidate(25));
		itemList.add(new Candidate(10));
		
	}
	public void forEach(Consumer<Candidate> c)
	{
		for(Candidate i:itemList)
		{
			c.accept(i);
			
		}
	}
	public void forEach(Predicate<Candidate>c)
	{
		for(Candidate i:itemList)
		{
			if(c.test(i))
			{
				System.out.println(i+"Candidate is eligible");
			}
			else
			{
				System.out.println(i+"Candidate is not Eligible");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CandidateDemo obj =new CandidateDemo();
		obj.forEach((e)->e.getAge()>18);
		
			
		}
}
