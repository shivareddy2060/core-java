package com.shivareddy.cj.basics;

import java.util.Scanner;

public class billamount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("enter billamount");
	   
	   float billamount=sc.nextFloat();
	   
	   float discount = 0;
	   float netamount = 0;
	   
	   if(billamount >10000) {
		  
		   discount = billamount*0.1f;   
	       
	   }
	   else
		   if(billamount>5000){
			   
			   discount = billamount*0.05f;
		   }
	   
	   netamount =billamount - discount;
	   
	   System.out.println("-----------------------------------------");
	   
	   System.out.println("bill amount="+ billamount);
	   
	   System.out.println("discount amount="+ discount);
	   
	   System.out.println("-----------------------------------------");
	   
	   System.out.println("net amount="+ netamount);
	   
	   System.out.println("---------------------------------------------");
	   
	   System.out.println("Thanks for shoping and come again!!!");
	   sc.close();
  }
}
