package com.shivareddy.cj.basics;

import java.util.Scanner;

public class MultiplicaionTable {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the number");
		 int num=sc.nextInt();
		 
		 for(int i=1;i<=10;i++) {
			 System.out.println(num+"*"+i+"="+num * i);
			 
		 }
		 sc.close();
	}

}
