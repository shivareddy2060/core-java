package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class primenumbersusingrecursion {

	//recursion:calling a method itself is called recursion
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number  value: ");
		int num=sc.nextInt();
		
		  boolean res = isprime(num);
		  
		  if(res) {
			  System.out.println(num+"  is a prime number");
		  }else
		  {
			  System.out.println(num+"   is not a prime number");
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

		
		
		/* boolean res = isprime(num);
		
		if(res) {
			System.out.println(num+"   is a prime number");
		}else
		{
			System.out.println(num+"    is not a prime number");
		}
		sc.close();
	}
		public static boolean isprime(int num) {
			
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

} */
