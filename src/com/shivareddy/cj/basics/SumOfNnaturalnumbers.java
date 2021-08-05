package com.shivareddy.cj.basics;

import java.util.Scanner;

public class SumOfNnaturalnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the N number");
		int N=sc.nextInt();
		
		//printing the N natural numbers 
		for(int i=1;i<=N;i++) {
			System.out.println(i);
		}
		
		//giving the sum of the N natural numbers
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum +=i;
		}
		
		System.out.println(" the sum of the N Natural numbers is:"+sum);
    sc.close();
	}

}
