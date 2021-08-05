package com.shivareddy.cj.basics;

import java.util.Scanner;

public class multiplicationoftables2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num value");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("-----------------------------");
		}
    sc.close();
	}

}
