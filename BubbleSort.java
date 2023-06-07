package com.java;

public class BubbleSort {
	
public static void bubbleSort(int [] arr, int len){
        
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(arr[j+1]<arr[j]){

                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] array = {10,5,3,1,24,12};
	        int len = array.length;
	        bubbleSort(array,len);

	        for(int i = 0; i<len; ++i){
	            System.out.print(array[i] + " ");
	        }
	    }


	
}
