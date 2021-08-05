package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num value");
		int num = sc.nextInt();
		
		           
		  int res=1;
		  
		     // this is the forward order of factorial number
		  
		  for(int i=2;i<=num;i++) {
			  res = res * i;  //res *=i; we can write like this also
			}
		  System.out.println("Thte factorial of number is:"+res);
		      
		  
		  //this is the reversed order of factorial of number
		  
		  int res1=1;
		    for(int i=num;i>=2;i--) {
		    	res1 = res1 * i;
		    }
		    System.out.println("The factorial of number is:"+res1);
          sc.close();
	   }

  }
