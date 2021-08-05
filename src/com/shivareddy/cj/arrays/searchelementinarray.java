package com.shivareddy.cj.arrays;

//import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;

public class searchelementinarray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number to search");
		int num = sc.nextInt();
		int[] arr=new int[] {25,58,47,48,98,62,47,95,73,76,69};
	
		
		  boolean ispresent=false;
	     for(int i:arr) {
	    	 if(i == num) {
	    		 ispresent=true;
	    		 break;
	    	 }
	     }
	     
	     if(ispresent) {
	    	 System.out.println("the number:  "+num+"   is present");
	     }
	     else
	     {
	    	 System.out.println("the number:  "+num+"   is not found");
	     }
	     sc.close();
	}
}

	  //this is program by using recursion method
	  //in this program i am generating the numbers into the int[] 
	//and in that ranom numbers i write logic to search an element
//	public static void main(String[] args) {
//		 
//		Scanner sc= new Scanner(System.in);
//		  
//		  
//		int[] arr= getrandomarray();
//		
//		System.out.println("enter the number to search:");
//		  int ele=sc.nextInt();
//		
//		//System.out.println(Arrays.toString(arr));
//		//System.out.println("-".repeat(50));
//		
//		boolean ispresent=false;
//		
//		for(int i:arr) {
//			if(i == ele) {
//				ispresent=true;
//				break;
//			}
//		}
//		
//		if(ispresent) {
//			System.out.println("The number "+ele+"   is present in   "+Arrays.toString(arr));
//		}else
//		{
//			System.out.println("The number "+ele+"    is not present in   "+Arrays.toString(arr));
//		}
//		sc.close();
//	}
// 
//	public static int[] getrandomarray() {
//	
//	int[] arr = new int[25];
//	
//	Random random = new Random();
//	
//	for(int i =0;i<arr.length;i++) {
//		
//		arr[i]=random.nextInt(100)+1;
//	}
//	return arr;
//	
//	}
//	
//}
