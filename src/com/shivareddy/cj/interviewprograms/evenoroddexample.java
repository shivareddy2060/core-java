package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class evenoroddexample {

	
	 public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      //this program finding even or odd by using recursion method
      System.out.println("enter the number vallue");
      int num = sc.nextInt();
      	 
      boolean res=iseven(num);
      
      if(res) {
    	  System.out.println(num+"  is even number ");
    	  
      }else
      {
    	  System.out.println(num+"  is a odd number");
      }
      
       
      sc.close();
	}
	 
	 public static boolean iseven(int num) {
		 if(num % 2 == 0) {
			 return true;
		 }
		 return false;
		 //return num % 2 == 0;
	 }

}
/*
 * public static void main(String[] args) {
	
   int num=11;
   
   if(num%2==0) {
	   System.out.println("your number    "+  num  +"   is even");
   }
   else {
	   System.out.println("your number    "+   num  +"   is odd");
   }
 }
   */