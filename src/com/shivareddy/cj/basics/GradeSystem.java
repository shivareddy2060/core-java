package com.shivareddy.cj.basics;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade="";
		
		 System.out.println(" Enter the score");
		 int score = sc.nextInt();
		 
		if(score > 90 && score <=100) {
			grade = "A";
		 }else
			  if(score >=70 && score <=90) {
				  grade = "B";
			  }else
				  if(score > 50 && score <= 70) {
					  grade = "c";
				  }else
					  if(score >= 40 && score <= 50 ) {
						  grade = "D";
					  }
					  else {
						  System.out.println("FAIL");
					  }
		System.out.println("Grade:"+grade);
		
		        sc.close();
		
	   }

  }
