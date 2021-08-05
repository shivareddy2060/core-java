package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		   //this logic is for sum of digits without using any method
//		int num = 15487;
//		
//		int sum = 0;
//		
//		 while(num != 0) {
//			 int remainder =num % 10;
//			 
//			 sum = sum +remainder;
//			 
//			 num = num / 10;
//		 }
//		 
//		 System.out.println("sum of the digits is: "+sum);
//		

		 
		//this logic for sum og digits  by using the recursion method
		
		     Scanner sc = new Scanner(System.in);

              System.out.println("enter the number:");
               int num = sc.nextInt();
     
               int sum = SumOfDigits(num);
                System.out.println("the sum of the digits of given number:   "+num+"  is::"+sum);
     
              sc.close();
	    }
	
            public static int SumOfDigits(int num) {
             int sum = 0;
          
             while(num != 0) {
          	  int r = num % 10;
        	  sum = sum+r;
       	     num = num / 10; 
         }
         return sum;
     }

}


