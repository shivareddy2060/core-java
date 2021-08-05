package com.shivareddy.cj.Stringexamples;

public class StringBasicexample {

	public static void main(String[] args) {
		
		String s1="core java";
		
		String s2="core java";
		
		String s3 = new String("core java");

		String s4 = new String("core java");

		
		  //This are by using == operator
		   // when we want to compare the reference variables then we should use == operator 
		
		System.out.println(s1 == s2);
		
		System.out.println(s1 == s3);
		
		System.out.println(s2 == s3);
		
		System.out.println(s3 == s4);
		
		//This is by using the  .equals() method
		// when we want to compare content of the object then we should use .equals() method 
		
        System.out.println(s2.equals(s3));
		
		System.out.println(s3.equals(s4));

	}

}
