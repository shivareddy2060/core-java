package com.shivareddy.cj.basics;

import java.util.Scanner;

public class Nnaturalnumbersexample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("enter the N number");
        int N=sc.nextInt();
        
        System.out.println("this is the forward order");
        for(int i=1;i<=N;i++) {
        	System.out.println(i);
        	
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("this is the reverse order");
        for(int i=N;i>=1;i--) {
        	System.out.println(i);
        }
        sc.close();
	}

}
