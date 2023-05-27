package com.java;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String db="aabbcaddaaee";
		char n='a';
		
		int count=0;
		for(int i=0;i<db.length();i++)
		{
			if(db.charAt(i)==n)
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
