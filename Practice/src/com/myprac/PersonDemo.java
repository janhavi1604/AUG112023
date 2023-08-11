package com.myprac;
import java.util.ArrayList;
import java.util.function.Consumer;




public class PersonDemo {
	
	ArrayList<Person> itemList=new ArrayList<>();
	
    PersonDemo()
{
	itemList.add(new Person("Peter","peter@yoyo.com"));
	itemList.add(new Person("Sam","sam@yoy.com"));
	itemList.add(new Person("Jack","Jack@yoyo.com"));
	itemList.add(new Person("Mick","Mike@yoyo.com"));
	
}
    public void forEach(Consumer<Person> c)
	{
		for(Person i:itemList)
		{
			c.accept(i);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonDemo obj =new PersonDemo();
		Consumer c =System.out::println;
		obj.forEach(c);
	}

}
