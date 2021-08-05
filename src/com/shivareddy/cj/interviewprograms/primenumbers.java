package com.shivareddy.cj.interviewprograms;

import java.util.Scanner;


//Prime NUmber:prime number which means A number which is divisible by 1 and it self is called prime number 



public class primenumbers {
         
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the num value");
		 int num = sc.nextInt();
	long stime=System.currentTimeMillis(); //this is for counting the how much time it takes to execute the programe/loop
		  boolean isprime = true;
		 
		 for(int i=2;i<=num/2;i++) {
			 if(num % i == 0) {
				 isprime = false;
				 break;
			 }
		 }
		 
		 long etime=System.currentTimeMillis(); //this is for counting the how much time it takes to execute the programe/loop
		 System.out.println(etime - stime);
		 if(isprime) {
			 System.out.println("the number"+num+"  is prime number");
		 }
		 else
		 {
			 System.out.println("the number   "+num+"  is not prime number");	 
		 }
		
		 sc.close();
		 
		  // we can find prime number like fallowing this:
		 /* Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num value");
		int num = sc.nextInt();
		
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(num+"---the number is a prime number ");
		}
		else
		{
			System.out.println(num+"---the number is not  a prime number ");
		}
      sc.close(); */
	}

}
