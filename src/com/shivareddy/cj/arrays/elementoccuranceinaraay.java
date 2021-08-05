package com.shivareddy.cj.arrays;

import java.util.Scanner;

public class elementoccuranceinaraay {

    public static void main(String[] args) 
   {
    	Scanner sc = new Scanner(System.in);
    	 System.out.println("enter the number which number you want to count the element occured");
    	int[] arr = {1,2,3,4,5,1,2,3,7,8,9,1,2,3,1,2,1,22};
    	
    	    int num = sc.nextInt();
    	    
    	    int count = 0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == num) {
    			count++;
    		}
    	}
    	System.out.println("the number occured   "+count+"   times");
    	sc.close();
    	
    //	we can write like 
//    	   int[] arr = {1,2,3,4,5,1,2,3,7,8,9,1,2,3,1,2,1,22};
//    	   
//    	    int count=0;
//    	   for(int i=0;i<arr.length;i++) {
//    		   if(arr[i] == 1) {
//    			   count++;
//    		   }
//    		   
//    	   }
//    	   System.out.println("the  element occured "+count+"  times");
    	
    	
   }
    
    
        //     we can write like this
    	
//        int n, x, count = 0, i = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter no. of elements you want in array:");
//        n = s.nextInt();
//        int a[] = new int[n];
//       System.out.println("Enter all the elements:");
//       for(i = 0; i < n; i++)
//       {
//           a[i] = s.nextInt();
//        }
//        System.out.print("Enter the element of which you want to count number of occurrences:");
//        x = s.nextInt();
//       for(i = 0; i < n; i++)
//       {
//           if(a[i] == x)
//            {
//                count++;
//          }
//        }
//        System.out.println("Number of Occurrence of the Element:"+count);
//        s.close();
//    }

    
}
