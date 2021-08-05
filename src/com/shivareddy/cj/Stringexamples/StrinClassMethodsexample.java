package com.shivareddy.cj.Stringexamples;

public class StrinClassMethodsexample {

	public static void main(String[] args) {
		String name = "shivareddy";
		
		int age = 23;
		
		double salary = 550000.55;

		// String data = name+"-"+age+"-"+salary; we can write like this as noraml 
		 String data = name.concat("-"+age).concat("-"+salary);//we can use concat() method in a String
		 System.out.println(data);
		 System.out.println("*".repeat(50));
		 String crickektteams = "india,australia,newzealand,southafrica,westindies,pakistan,england,bangladesh,srilanka,afghanisthan";
		  
		    System.out.println("the best top 10 criket teams in the world are:  ");
		  String[] arr= crickektteams.split(",");
		      
	
		     
		  for(String ele:arr) {
			  System.out.println(ele.toUpperCase());
		  }
		   
		   System.out.println("*".repeat(50));
		   String name1="shivareddy";
		    System.out.println("the length of the string is:");
		   System.out.println(name1.length());
		 
	    }  
	}


//String str = "Javatpointtt";  
//System.out.println("Returning words:");  
//String[] arr = str.split("t", 0);  
//for (String w : arr) {  
//    System.out.println(w);  
//}  
//System.out.println("Split array length: "+arr.length);  
//}  



//String Str = new String("Welcome-to-Tutorialspoint.com");
//System.out.println("Return Value :" );      
//
//for (String retval: Str.split("-")) {
//   System.out.println(retval);

