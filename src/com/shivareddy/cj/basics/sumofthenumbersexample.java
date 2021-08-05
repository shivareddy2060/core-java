package com.shivareddy.cj.basics;

import java.util.Scanner;

public class sumofthenumbersexample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the a value  number ");
		int a = sc.nextInt();
		
		System.out.println("enter the b value  number ");
		int b = sc.nextInt();
		
		int c= a + b;
		
		System.out.println("the sum of the "+a+"and"+b+"is:"+c);
		sc.close();
		
		/* int a=10;
		int b=20;
		
		int c=a+b;
		
		System.out.println("the sum of the "+a+"and"+b+"is:"+c);*/
	}

}
