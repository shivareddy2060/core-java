package com.shivareddy.cj.arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrayoperation {

	public static void main(String[] args) {
		//this program , generate the random number between 1-100 using arrays
		//and finding the maxim element and minimum element and sum of the numbers and average of the numbers
	        
		
		//this program is by using the recursion method
		int[] arr= GetRandomArray();
	        System.out.println(Arrays.toString(arr));
	        
	        
	        int max= arr[0];
	        int min= arr[0];
	        int sum=0;
	        for(int i=0;i<arr.length;i++) {
	        	if(max<arr[i]) {
	        		max=arr[i];
	        	}
	        	if(min>arr[i]) {
	        		min=arr[i];
	        	}
	        	sum = sum+arr[i];
	        }
	        float avg = sum/(float)arr.length;
	        
	        System.out.println("the maximum element in the random numbers is:  "+max);
	        System.out.println("the minimum element in the random numbers is:  "+min);
	        System.out.println("the sum of the  elements of  the random numbers is:  "+sum);
	        System.out.println("the average elements of the random numbers is:  "+avg);
	  }
	  
	
	public static int[] GetRandomArray() {
		int[] arr = new int[25];
	    
		 Random random = new Random();
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=random.nextInt(100)+1;
		 }
		 return arr;
	}
	
	

}
//		int[] arr = new int[20];
//		
//		Random random = new Random();
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			arr[i]=random.nextInt(100)+1;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		             
//		         int min=arr[0];
//		         int max=arr[0];
//		         int sum = 0;
//		        
//               for(int i=0;i<arr.length;i++) {
//            	   if(max<arr[i]) {
//            		   max = arr[i];
//            	   }
//            	   
//            	   if(min>arr[i]) {
//            		   min=arr[i];
//            	   }
//            	   sum=sum+arr[i];
//           }
//              float avg=sum/(float)arr.length;
//              
//              System.out.println("the maximum element is:  "+max);
//              System.out.println("the minimum element is:  "+min);
//              System.out.println("the sum of the elements is:  "+sum);
//              System.out.println("the average of the  elements is:  "+avg);
//               
//	}
//
//}
