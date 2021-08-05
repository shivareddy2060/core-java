package com.shivareddy.cj.Stringexamples;

public class StrinBufferandStringBuilderexample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("HELLO");
        
		System.out.println(sb);
		  
		sb.append("JAVA");
		System.out.println(sb);
		
		String name="sivareddy";
		
		String gmail = "shivareddy@gmail.com";
		
		int age = 23;
		
		String city = "Hyderabad";
		
		//below logic is by using the String concat() method
		
//		String data = name.concat("-"+gmail).concat("-"+age).concat("-"+city);
//		
//		System.out.println(data);
		
		//instead of using string concat ,we can use StringBuilder object creation and then use append() method
		
		StringBuilder str = new StringBuilder(name).append("-").append(gmail).append("-").append(age).append("-").append(city);
		System.out.println(str);
	}

}
