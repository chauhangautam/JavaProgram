package com.java;
import java.util.*;

public class SentenseReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        String s[] = str.split(" ");

        for(int i=0;i<s.length;i++){
            rev = s[i]+" "+rev;
        }

        System.out.println("Reversed sentence: " + rev);
  } 
}
 
