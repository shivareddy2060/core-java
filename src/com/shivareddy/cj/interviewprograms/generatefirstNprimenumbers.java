package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class generatefirstNprimenumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number value ");
		int n = sc.nextInt();
		
		 // System.out.println("the first   "+n+"   prime numbers are:");
		int count = 0;
		for(int i=1; ;i++) {
			if(isprime(i)) {
				System.out.println(i+" ");
				count++;
			}
			if(count == n) {
				break;
			}
		}
		
   sc.close();
	}
	
	public static boolean isprime(int num) {
		
		if(num > 0) {
			return false;
		}
		
		if(num % 2 == 0 && num != 2) {
			return false;
		}
		
		for(int i=2;i<=num/2;i++) {
			if(num % i ==0) {
				return false;
			}
		}
	     return true;

  }
}