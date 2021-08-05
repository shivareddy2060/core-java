package com.shivareddy.cj.interviewprograms2021;

public class smallestnumberandsecondsmallestnumberinarray {
	 //this logic is for finding smallest/lowest number in the array numbers number
//	  public static void main(String[] args) {
//		int[] arr = {12,22,41,23,42,17,88,98,95,96,21,31};
//		
//		int min=arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//		}
//		System.out.println("the minimum element in the given array numbers is:  "+min);
//	}
	
	
	
	
	//this logic is to find the second lowest/smallest number in thegiven array numbers 
	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];//2nd element because index starts from 0  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second smallest: "+getSecondSmallest(a,6));  
		System.out.println("Second smallest: "+getSecondSmallest(b,7));  
		}
}
