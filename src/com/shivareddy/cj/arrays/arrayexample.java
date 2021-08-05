package com.shivareddy.cj.arrays;

import java.util.Arrays;

public class arrayexample {

	public static void main(String[] args) {
		
		int[] arr= new int[] {1,2,3,4,5,6,7,8,9,10};
		          int min=arr[0]; 
		          int max= arr[0];
		   for(int i=0;i<arr.length;i++) {
			  if(min>arr[i]) {
				  min=arr[i];
			  }
			  if(max<arr[i]) {
				  max=arr[i];
			  }
		   }
		   System.out.println("the minimum value of the arrynumbers is :  "+min);
            System.out.println("the maximum value of the arrynumbers is :  "+max);
		
		   System.out.println("*".repeat(50));
		
		   for(int i=arr.length-1;i>=0;i--) {
			   System.out.println(arr[i]);
		   }
		
		   System.out.println("*".repeat(50));
		
		    for(int ele:arr){
		    	System.out.println(ele);
		    }
		
			 System.out.println(arr.length);
			System.out.println(Arrays.toString(arr));
			System.out.println("*****************"); 
		
		
		
		/*for(int i=0;i<arr.length;i++) {
		    arr[i]=i+1;
		}
		System.out.println(arr); */
	}

}




