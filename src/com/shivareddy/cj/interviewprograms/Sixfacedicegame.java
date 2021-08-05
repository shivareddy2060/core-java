package com.shivareddy.cj.interviewprograms;

import java.util.Random;
import java.util.Scanner;

public class Sixfacedicegame {
public static void main(String[] args) {
	
	
	//this program to guess the generate number in only three attempts
	
	
	Scanner sc= new Scanner(System.in);
	
	Random random = new Random();
	
	int rnumber=random.nextInt(15)+1;
	 for(int i=1;i<=3;i++) {
	System.out.println("enter the number in the range 1-15");
	int num = sc.nextInt();
	
	if(num == rnumber) {
		System.out.println("congratulations    your number is:  "+rnumber+"    in "+i+"   attempts");
		break;
	}
	else
		if(i==3){
			System.out.println("sorry! you have reached maximum number of attempts and actual number is:: "+rnumber);
		}
		else
	{
		System.out.println("sorry! try again");
	}
  }
	 sc.close();
}

}

  //this program to guess the generate number in only one attempt
/* public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	Random random = new Random();
	
	int rnumber = random.nextInt(15)+1;
	
	System.out.println("enter the  number in range 1-15");
	int num = sc.nextInt();
	
	if(num == rnumber) {
		System.out.println("congratulations your  number "+rnumber);
	}
	else
	{
		System.out.println("sorry! the number is:  "+rnumber);
	}
	
	sc.close();

}

*/