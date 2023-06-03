package com.java;
import java.util.*;

public class LinkedListAnotherExample {
	class LinkedListExm{
		Node head;
	}
	
	class Node{
		int data;
		Node next;
		
		Node (int data){
			this.data=data;
			this.next=next;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<Integer> list=new LinkedList<Integer>();
			list.add(3);
			list.add(7);
			list.add(9);
			list.add(11);
			list.add(13);
			System.out.println(list);
			
			list.add(2,5);  // add in specified index
			
			System.out.println(list);
			
			list.remove(4);  //remove element
			System.out.println(list);
			
	}

}
