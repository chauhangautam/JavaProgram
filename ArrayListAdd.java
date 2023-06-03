package com.java;
import java.util.*;

public class ArrayListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> student=new ArrayList<String>();
		student.add("Gautam");
		student.add("Abhi");
		student.add("Sorabh");
		student.add("Ravi");
					
		System.out.println(student);
		
		student.add(2,"Prabhat");  //Add  item in  specified index 
		System.out.println( "Updated List:"  + student);
		
		student.add("Sanjay");  ///add in end 
		System.out.println( " in end Updated List:"  + student);
		
	}

}
