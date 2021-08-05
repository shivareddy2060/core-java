package com.shivareddy.cj.basics;

import java.util.Scanner;

public class CastingVote {

	public static void main(String[] args) {
		
		
		/*in this programe i am using OR operator that means 
		 * in that both expresiions ,
		 * ---1.any one of the expression is true then it will return true 
		 * ---2. if both expressions are false then it will return false  
		*/
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter the  dl number");
		 String dl = sc.nextLine();
		 
		 System.out.println("enter your age ");
		 int age = sc.nextInt();
		 
		 if(dl.length() != 0 || age >18 ) {
			 System.out.println("please go and cat your vote");
		 }else
		 {
			 System.out.println(" sorry! you cant cast your vote");
		 }
		 
		sc.close();
		
		/*in this this program i am using OR operator
		//if number is even then write true or number is divisible by 55 then it will return true  
		// otherwise it will return false
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("enter the number");
		int num = sc.nextInt();
		
		if(num % 2 ==0 || num % 5 == 0) {
			System.out.println("SUCCESS");
		}else
		{
			System.out.println("FAIL");
		}
     sc.close();*/
	}

}
