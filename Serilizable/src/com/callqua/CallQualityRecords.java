package com.callqua;
import java.io.*;

public class CallQualityRecords {
	
	public void saveCallQualityRecords(CallQuality callquality)
	{
		 try {
		FileOutputStream fileout=new FileOutputStream(callquality.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(callquality);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	
	public void displayCallQualityRecords(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			CallQuality callquality =(CallQuality)objectin.readObject();
			
			System.out.println("CallID "+callquality.getCallId());
			System.out.println("CallDuration "+callquality.getCallDuration());
			System.out.println("CallQualityGrade"+callquality.getCallQualityGrade());
			System.out.println("CallerName"+callquality.getCustomerName());
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallQuality obj1=new CallQuality(1,50,"A","Peter");

		CallQualityRecords records=new CallQualityRecords();

		records.saveCallQualityRecords(obj1);
		records.displayCallQualityRecords(obj1.getCustomerName());


	}

}
