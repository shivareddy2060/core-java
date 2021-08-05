package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class FactorsOfgivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num value:");
		int num = sc.nextInt();
		System.out.println("the factors of the number is:");
		  for(int i=1;i<=num;i++) {
			  if(num % i == 0) {
				  
				  System.out.print("  "+i);
			  }
		  }
          sc.close();
	}

}
