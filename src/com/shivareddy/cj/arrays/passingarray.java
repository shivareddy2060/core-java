package com.shivareddy.cj.arrays;

public class passingarray {
	//Java Program to demonstrate the way of passing an array  
	//to method.  
	
	//creating a method which receives an array as a parameter  
	static void minmax(int arr[]){  //this logic to find minimum value
	/* int min=arr[0];  
	for(int i=1;i<arr.length;i++) { 
	 if(min>arr[i])  
	  min=arr[i];  
	}
	System.out.println(min);  
	*/
	
	// this logic to find maxim value
	  int max=arr[0];
	  int min=arr[0];
	  
	for(int i=1;i<arr.length;i++) { 
		 if(max<arr[i]) { 
		  max=arr[i];  
		}
		 if(min<arr[i]) {  
			  min=arr[i];  
			}
	}
	
	    
		System.out.println(max);  
		System.out.println(min);  
	}  
	  
	public static void main(String args[]){  
	int a[]={33,3,1,85,47,98,87,4,5};//declaring and initializing an array  
	System.out.println("the minimum number in the arraynumbers is:  ");
	//min(a);//passing array to method 
	minmax(a);
	}
}  
	


	

