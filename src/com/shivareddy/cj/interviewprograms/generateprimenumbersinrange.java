package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class generateprimenumbersinrange {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		
		 System.out.println("enter the lb value:");
		 int lb=sc.nextInt();
		 
		 System.out.println("enter the ub value:");
		 int ub=sc.nextInt();
		 
		 
		 System.out.println("the prime numbers  in between    "+lb+"  ANd     "+ub);   
		 
		   for(int i=lb;i<=ub;i++) {
			   boolean res=isprime(i);
			   
			   if(res) {
				   System.out.print(i+ " ");
			   }
		   }
		
		
		sc.close();
	}

	 public static boolean isprime(long num) {
	       
		  
		   if(num < 0) {
			   return false;
		   }
		   
		   if(num % 2 == 0 && num != 2) {
			   return false;
		   }
		   
		   for(int i=2;i<=num/2;i++) {
			   if(num % i == 0) {
				   return false;
			   }
		   }
		   
		   return true;
	  }
}
