package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;

public class palindromenumbe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the  number:");
		int num = sc.nextInt();
		
		 int temp = num;
		  
		  int rev = 0;
		while(temp != 0 ) {
			int r =temp % 10;
			
			rev = temp * 10 + r;
			num= num / 10;
		}
		
		if(num == rev) {
			System.out.println("the number   "+num+"  is:palindrome");
		}
		else
		{
			System.out.println("the number   "+num+"  is: not a palindrome");
		}
     sc.close();
	}

}

