package com.shivareddy.cj.Stringexamples;

public class SubStringExample {

	public static void main(String[] args) {
		//in thisnprograme  i am generating subStrings
		
		//"rajesh" , n=4 sub string is  [raje,ajes,jesh]
		substringofgivensize("rajesh",4);
		
	}
   public static void substringofgivensize(String str,int n) {
	   
	   for(int i=0;i<str.length()-n+1;i++) {
		   System.out.println(str.substring(i,i+n));
	   }
   }
}
