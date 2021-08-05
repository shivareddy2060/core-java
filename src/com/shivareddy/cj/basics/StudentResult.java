package com.shivareddy.cj.basics;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		if(num>=40) {
			System.out.println("CONGRATULATIONS.................:PASS");
		}
		else
		{
			System.out.println("sorry! better luck next time.......:FAIL");
		}
  sc.close();
	}

}
