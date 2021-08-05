package com.shivareddy.cj.interviewprograms2021;

public class sumofevenandodd {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,7,88,77,59,41,33,28};
		
		
		     int sumofeven = 0;
		     int sumofodd = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				sumofeven= sumofeven+arr[i];
			
			}
			else
				if(arr[i] % 2 !=0){
					sumofodd = sumofodd + arr[i]; 	
				}
			
				
		}
		System.out.println("the sum of the even number in the array is:"+sumofeven);
		System.out.println("the sum of the odd number in the array is:"+sumofodd);
		}
	}


