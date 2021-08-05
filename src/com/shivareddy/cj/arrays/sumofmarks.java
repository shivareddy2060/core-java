package com.shivareddy.cj.arrays;

import java.util.Scanner;

public class sumofmarks {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("the subject  "+(i+1)+" score: ");
			 arr[i] = sc.nextInt();
		}
		
		 int total = 0;
		  for(int i=0;i<arr.length;i++) {
			  total = total + arr[i];
		  }
		  System.out.println("the total marks for the "+n+"  subjects is:"+total);
	
	sc.close();
	}

}


//we can write like this also

/*
 * package com.shivareddy.cj.arrays;

public class arrayexample {

	public static void main(String[] args) {
		
		int[] arr= new int[] {85,78,49,78,98,78};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("the subject score:"+(i+1)+" is:  "+arr[i]);
		}
		
		
		int total =  0;
		for(int i=0;i<arr.length;i++) {
			total= total+arr[i];
		}
		System.out.println("the total score of the subjects is:   "+total);

	}

}
 */
