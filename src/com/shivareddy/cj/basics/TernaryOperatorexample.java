package com.shivareddy.cj.basics;

import java.util.Scanner;

public class TernaryOperatorexample {

	
	   //finding the biggest number of three numbers using ternery operator
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the  number1");
		int num1=sc.nextInt();
		
		System.out.println("enter the number2");
		int num2=sc.nextInt();
		
		System.out.println("enter the number3");
		int num3=sc.nextInt();
		
		int big=(num1 >num2 &&  num1>num3)? num1: (num2>num3)?num2:num3;
		
		
			
		System.out.println("The biggest number in three numbers is:"+big);
		sc.close();
	}

}
