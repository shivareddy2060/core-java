package com.shivareddy.cj.interviewprograms2021;

public class reverseofstring {

	public static void main(String[] args) {
		
		
		int[] arr = {22,14,24,5,8,47,9,8,558,48,39};
		
		
		   int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
		
		
//		String name="shivareddy";
//		
//		
//		
//		
//		//this logic for reverse of a string
//		
//		for(int i=name.length()-1;i>=0;i--) {
//			System.out.println(name.charAt(i)+" ");
//		}
//    
//		System.out.println("*".repeat(50));
//		   
//		 //this logic for forward of string
//		
//		for(int i=0;i<name.length();i++) {
//			System.out.println(name.charAt(i)+"  ");
//		}
		
	}

}
