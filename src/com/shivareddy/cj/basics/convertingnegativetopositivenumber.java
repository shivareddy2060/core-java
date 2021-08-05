package com.shivareddy.cj.basics;

import java.util.Scanner;

public class convertingnegativetopositivenumber {

	public static void main(String[] args) {
		
		//converting the negative number to positive number
		
		/* int num=-10;
		
		if(num <0) {
			num=-(num);
			System.out.println(num);
			*/

		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter the  number");
		  int num = sc.nextInt();
		  
		  //this logic is by fallowing  algorithm
		  if(num<0) {
			  num=-num;
			  System.out.println(num);
		  }
		  else
		  {
			  System.out.println(num);
		  }
		  sc.close();
//		  if(num <0) {
//			  num = -num;  
//		  }
//		  System.out.println(num);
//		  sc.close();
		}
			
	}


