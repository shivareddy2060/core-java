package com.shivareddy.cj.Stringexamples;

public class Stringclassesmethodsexamples2 {

	public static void main(String[] args) {
		
		//in this programe i am using split(),charAt(),substring(),trim()
		//toLowercase,toUppercase()
		
		
		String name= "shivareddy";
		
		System.out.println(name.length());

	
     	for(int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i)+"    ");
		}
		
		String countries = "india,australia,newzealand,pakistan,southafrica,england,bangladesh,westindies,srilanka,afhanisthan";
		
		  String[] arr = countries.split(","); 
		
		 for(String ele:arr) {
			 System.out.println("The country name  is:  "+ele.toUpperCase());
			 System.out.println("The country code is:  "+ele.toUpperCase().substring(0,3));
		 }
		 
		 String htno = "102X2MCA5470,102X2MBA5470,102X2CSC5470,102X2MSC5470,102X2BSC5470";
		 
		 String[] arr1 = htno.split(",");
	
	     for(String ele:arr1) {
	    	 System.out.println(ele.substring(5,8).toLowerCase());
     }
	
	     String s = "hi guys welcome to java world";
	     
	      System.out.println(s.substring(5,10).trim());
	      System.out.println(s.trim().length());
	}

}


















