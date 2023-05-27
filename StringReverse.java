package com.java;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st="Gautam";
		String bl=" ";
		for(int i=st.length()-1;i>=0;i--)
		{
			bl=bl+st.charAt(i);
			
		}
		System.out.print(bl);

	}

}
