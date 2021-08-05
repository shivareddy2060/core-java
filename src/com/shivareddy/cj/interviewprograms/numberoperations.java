package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class numberoperations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int sum = SumOfDigits(num);
		int reverse = reversofnumber(num);
		
	
		System.out.println("the sum of the digits of:     "+num+"   is: "+sum);
		
		System.out.println("the reverse of the  :      "+num+"    is: "+reverse);
	   
		  if(isamstrong(num)) {
			  System.out.println("the number  "+num+"   is amstrong");
		  }else
		  {
			  System.out.println("the number   "+num+"  is not a amstrong");
		  }
		sc.close();
	}
		
	
	     public static boolean isamstrong(int num) {
	    	 
	      /* amstrong number means a number(153) which is equal to sum of individual 
	    	 digit number cube(like 1^3 + 5^3 + 3^3 = 153)  */
	    	 int temp=num;
	    	 int sum = 0;
	    	 
	    	 while(temp != 0) {
	    		 int r = temp % 10;
	    		 
	    		 sum = sum + r*r*r;
	    		 
	    		 temp = temp / 10;
	    	 }
	    	 return sum == num;
	     }
	    
	
	
	
	
		public static int SumOfDigits(int num) {
			
			int sum=0;
			 
			while(num != 0) {
				int r=num % 10;
				sum = sum + r;
				
				num = num / 10;
			}
			return sum;
		}
         
		
		public static int reversofnumber(int num) {
			int rev = 0;
			
			while(num != 0) {     
				int  r = num % 10;
				
				rev = rev * 10 + r;
				num = num / 10;
			}
			return rev;
		}
}






















