package com.shivareddy.cj.interviewprograms;

public class CountVowels {

	public static void main(String[] args) {
		
	 String name = "COREJAVAISAFUN";
		
	 
		
		  int vcount = 0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			
			 switch(ch) {
			 case 'A':
			 case 'E':
			 case 'I':
			 case 'O':
			 case 'U':
				
				 vcount++;
			     break;
			 }
			 	 
		}
		System.out.println("The vowels count is:"+vcount);
		 

	}

}   
		

/*public class vowel {
    public static void main(String[] args)
        throws IOException
    {
        String str = "GeeksForGeeks";
  
            str = str.toLowerCase();
  
        // toCharArray() is used to convert 
        // string to char array
        char[] chars = str.toCharArray();
  
        int count = 0;
  
        for (int i = 0; i < str.length(); i++)
        {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
            {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        }
  
        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
    }
}

*   Output
    Total no of vowels in string are: 5
*
*
*/

/*
 * import java.io.*;
  
class GFG {
  
    // isVowel() function returns 1 if the
    // character is a vowel and 0 if it is not
    static int isVowel(char chars)
    {
        if (chars == 'a' || chars == 'e' || chars == 'i'
            || chars == 'o' || chars == 'u') {
            return 1;
        }
        else {
            return 0;
        }
    }
  
    // recursive function to return the number
    // of characters in a string
    static int vowelno(String str, int l)
    {
        if (l == 1) {
            return isVowel(str.charAt(l - 1));
        }
  
        return vowelno(str, l - 1)
            + isVowel(str.charAt(l - 1));
    }
  
    public static void main(String[] args)
        throws IOException
    {
        String str = "BufferedOutput";
  
        str = str.toLowerCase();
  
        System.out.println(
            "Total number of vowels in string are:");
  
        System.out.println(vowelno(str, str.length()));
    }
}




Output
Total number of vowels in string are:
6
 */





