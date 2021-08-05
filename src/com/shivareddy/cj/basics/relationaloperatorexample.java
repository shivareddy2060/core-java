package com.shivareddy.cj.basics;

import java.util.Scanner;

public class relationaloperatorexample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num1:");
		int a = sc.nextInt();
		
		System.out.println("enter the num2:");
		int b = sc.nextInt();
		
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
			
	sc.close();	

	}

}
