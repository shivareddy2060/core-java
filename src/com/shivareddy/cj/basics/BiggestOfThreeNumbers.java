package com.shivareddy.cj.basics;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {
		
		
      Scanner sc = new Scanner(System.in);
	
	   System.out.println("enter the num1:");
	   int num1=sc.nextInt();
	   
	   System.out.println("enter the num2:");
	   int num2=sc.nextInt();
	   
	   System.out.println("enter the num3:");
	   int num3=sc.nextInt();
	   
	   if(num1>num2 && num1 > num3) {
		   System.out.println("the Biggest number is:"+num1);
	   }
	   else
		   if(num2 > num1 && num2 > num3) {
			   System.out.println("the Biggest number is:"+num2);
		   }
		   else
		   {
			   System.out.println("the Biggest number is:"+num3); 
		   }
	   sc.close();
	}

}
