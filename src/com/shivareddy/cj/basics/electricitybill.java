package com.shivareddy.cj.basics;

import java.util.Scanner;

public class electricitybill {
       public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		     int min_charges = 50;
		    int unit_price = 0;
		    
		  System.out.println("enter the used  units ");
		  int units = sc.nextInt();
		  
		  if(units >=1 && units <=50 ) {
			  unit_price = 1;
		  }else 
			  if(units > 50 && units <= 100){
				  unit_price = 3;
			  }
			  else
				  if(units > 100 && units <= 200) {
					 unit_price = 5; 
				  }
				  else
				  {
					  unit_price = 8;
				  }
	
              int bill_amount = units * unit_price ;
              
              int Total_bill =bill_amount + min_charges;
              
              System.out.println("the number of units are used in this month:"+units);
              System.out.println("the uint price is :"+ unit_price);
              System.out.println("the total bill amount is :"+ bill_amount);
              System.out.println("the minimum charges is:"+min_charges);
              System.out.println("***************------------*************************");
              System.out.println("Thte total amount  is:"+Total_bill);
              
              System.out.println("*********************-----------------***************");
              System.out.println("This is bill is declared  by muncipal corporation electricty team ");
              sc.close();
       }
}
