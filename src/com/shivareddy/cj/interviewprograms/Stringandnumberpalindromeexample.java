package com.shivareddy.cj.interviewprograms;

public class Stringandnumberpalindromeexample {

	public static void main(String[] args) {

		System.out.println(ispalindrome("hello"));
		System.out.println(ispalindrome("12321"));
		System.out.println(ispalindrome("254178"));
		System.out.println(ispalindrome("dad"));
		
		System.out.println(isFound(args, "bob"));

	}
	  //this logiic for searching element in the String array
	  public static boolean isFound(String[] arr,String key) {
		  
		  for(String ele:arr) {
			  if(ele.equals(key)) {
				  return true;
			  }
		  }
		  return false;
	  }
	 
	
	
	  //this logic ia for number and String palindrome
	public static boolean ispalindrome(String str ) {
		//this is logic is by using StrinBuilder
		return new StringBuilder(str).reverse().toString().equals(str);
		   //this logic is by using recursion method
//		for(int i=0,j=str.length()-1;i<=j;i++,j--) {
//			if(str.charAt(i) != str.charAt(j)) {
//				return false;
//			}
//		}
//		  return true;
	}

}
