package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num value");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"    ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		 for(int i=num;i>=1;i--) {
			 
			for(int j=1;j<=i;j++) {
				System.out.print(j+"     ");
			}
			 System.out.println();
		 }
			 
			 
			 
		//System.out.println("this is called an pattern program");
      sc.close();
	}

}
