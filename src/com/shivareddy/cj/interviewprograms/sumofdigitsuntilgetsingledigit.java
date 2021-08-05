package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class sumofdigitsuntilgetsingledigit {

	public static void main(String[] args) {
		
		// this logis is for sum of digits until get a single digit without using any method
//		int num = 15487;
//		
//		  int sum = 0;
//		while(num >9) {
//			 sum = num % 10 + num / 10;
//			num =sum;
//		}
//		System.out.println("sum of the digits in a given number until get a single number is:  "+sum);
		
		
		
		//this logic for sum og digits unil get the single digit  by using the recursion method
	Scanner sc = new Scanner(System.in);		
		System.out.println("enter the number:");
		int num = sc.nextInt();		int sumofdigits = sumofdigitsuntilgetsingledigit(num);
		
		System.out.println("the sum of the digits of given number  "+num+"  is:"+sumofdigits);
		sc.close();
	}
	
		public static int sumofdigitsuntilgetsingledigit(int num) {
		
		while(num > 9) {
				
			   int	sum = num / 10 + num % 10;
				num = sum;
			}
			return num;
		}

	

}
