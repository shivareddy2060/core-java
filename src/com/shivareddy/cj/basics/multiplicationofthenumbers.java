package com.shivareddy.cj.basics;

import java.util.Scanner;

public class multiplicationofthenumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the  number");
		int a=sc.nextInt();
		
		System.out.println("enter the  number");
		int b=sc.nextInt();
		System.out.println("enter the  number");
		int c=sc.nextInt();
		
		System.out.println("enter the  number");
		int d=sc.nextInt();
		
		System.out.println("enter the  number");
		int e=sc.nextInt();
		
		int result=a+b/c*d+e;
		
		System.out.println("result of the operations is:"+result);
		sc.close();
	}

}
