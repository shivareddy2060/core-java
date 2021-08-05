package com.shivareddy.cj.interviewprograms;

public class pallindromeexample {

	public static void main(String[] args) {
		String str ="shivareddy";
      
		
		//this logic for reverse of a String
//		  for(int i=str.length()-1;i>=0;i--) {
//			  System.out.print(str.charAt(i)+"   ");
//		  }
		
		
		//this ligic to find the given String is palindrome or not
		
		for(int i=0,j=str.length()-1;i<=j;i++,j--) {
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("The given String is  not a pallindrome: "+str);
			}
			else
			{
				System.out.println("The given String is  a palindrome pallindrome: "+str);
			}
		}
	}

}
