package com.shivareddy.cj.basics;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num1");
		int num1 = sc.nextInt();
		
		System.out.println("enter the num2");
		int num2 = sc.nextInt();
		
		//performing the sum,substraction,average,multiplication,division operatins
		
		int sum=num1+num2;
		
		int mul=num1*num2;
		
		int sub=num1-num2;
		
		float avg=sum/2;
		
		int div = num1/num2;
		
		int mod= num1%num2;
		
		System.out.println("the sum of   "+num1+"+"+num2+"="+sum);
		System.out.println("the mul of   "+num1+"*"+num2+"="+mul);
		System.out.println("the sub of   "+num1+"-"+num2+"="+sub);
		System.out.println("the avg of   "+num1+" and "+num2+"is:"+avg);
		System.out.println("the div of   "+num1+"/"+num2+"="+div);
		System.out.println("the mod of   "+num1+"%"+num2+"="+mod);
		
		sc.close();
		}
}
