package com.shivareddy.cj.basics;

import java.util.Scanner;

public class calcusingswitchcaseexample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter the number1:");
		int num1 = sc.nextInt();
		
		System.out.println("enter the number2:");
		int num2 = sc.nextInt();
		while(true) {
		System.out.println("------------------------------------------------------");
		
		System.out.println(" 1.add   2.sub   3.mul   4.div   5.mod   6.exit");
		
		System.out.println("------------------------------------------------------");

		  System.out.println("enter your choice:");
		  
		  int ch=sc.nextInt();
		  
		
			  switch(ch) {
			     
			  case 1:
				  int sum = num1 + num2;
				  System.out.println(num1+ " + "+num2+"  =  "+sum);
				  break;
				  
			  case 2:
				  int sub = num1 - num2;
				  System.out.println(num1+ " - "+num2+"  =  "+sub);
				  break;
			  case 3:
				  int mul = num1 * num2;
				  System.out.println(num1+ " * "+num2+"  =  "+mul);
				  break;
			  case 4:
				  int div = num1 / num2;
				  System.out.println(num1+ " / "+num2+"  =  "+div);
				  break;
			  case 5:
				  int mod = num1 % num2;
				  System.out.println(num1+ " % "+num2+"  =  "+mod);
				  break;
			  case 6:
				 
				  System.out.println("SEE YOU.........");
			      System.exit(0);	  
			     sc.close();
			default:
				System.out.println("please! enter the valid number (1-6)");
				  
			  }
		  }
	}

}
