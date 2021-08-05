package com.shivareddy.cj.interviewprograms;

//import java.util.Scanner;

public class reverseofthenumber {

	public static void main(String[] args) {
		
		
		
		int num=1582;
		
		int rev = 0;
		
		while(num !=0) {
			int remainder = num % 10;
			
			rev = rev * 10 + remainder;
		    num = num / 10;
		}
		
		System.out.println("the reverse of the numer is:"+rev);
//		Scanner sc = new Scanner(System.in);
//		
//		 System.out.println("enter the number:");
//		 int num = sc.nextInt();
//		 
//		 int rev = reverse(num);
//		 
//		 System.out.println("the reverse of the given number "+num+"  is:"+rev);
//		 sc.close();	 
//	}
//       
//	public static int reverse(int num) {
//		int rev=0;
//		
//		while(num !=0) {
//			int r = num % 10;
//			rev = rev * 10 + r;
//			num = num / 10;
//		}
//		return rev;
	}
}

   