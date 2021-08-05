package com.shivareddy.cj.Stringexamples;

public class stringexamples {

	public static void main(String[] args) {
		
		String s1= "hello";
       String s2=new String("hello");
	    String s3=new String(new char [] {'h','e','l','l','o'});
	    String s4="shivareddy";
	    String s5="kondareddy";
	    System.out.println(s1);
        System.out.println(s2);
	    System.out.println(s3);
	    
     System.out.println(s1 == s2);
     System.out.println(s1.equals(s5));
     System.out.println(s1.equals(s2));
     System.out.println(s4 == s5);
	}

}
