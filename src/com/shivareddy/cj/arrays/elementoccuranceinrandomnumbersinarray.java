package com.shivareddy.cj.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class elementoccuranceinrandomnumbersinarray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number to search");
		int ele=sc.nextInt();
		//this logic to finding the elemnt occurence in random array number by using the recursion method
		int[] arr = GetRandomArray(); 
		System.out.println(Arrays.toString(arr));
		
System.out.println("the element   "+ele+ "   occured   "+occurence(arr,ele) +"  times in:"+Arrays.toString(arr));
	   sc.close();
	}
	  public static int occurence(int[] arr,int key) {
		  int count = 0;
		 
		  for(int ele:arr) {
			  if(ele == key) {
				  count++;
			  }
			  
		  }
		  return count;
		  
	  }
		public static int[] GetRandomArray() {
			int[] arr = new int[25];
			
			Random random = new Random();
			
			for(int i=0;i<arr.length;i++) {
			arr[i] = random.nextInt(30)+1;
			}
			return arr;
		}
		
		
		//this logic for finding element occurrence in random array numbers without  using the method
//		Scanner sc= new Scanner(System.in);
//		
//		int[] arr= new int[25];
//		
//		Random random = new Random();
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = random.nextInt(30)+1;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println("enter the number which number you want count");
//		int num = sc.nextInt();
//		  
//		  int count = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] == num) {
//				count++;
//			}
//		}
//		System.out.println("the number occured   "+count+"   times");
//        sc.close();
	

}
