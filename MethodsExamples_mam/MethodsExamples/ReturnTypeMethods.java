package MethodsExamples;

import java.util.Scanner;

public class ReturnTypeMethods {
	 
	public int  sum(int a, int b) {
		int c =a+b;
		return c;
	}
	public int avg() {
		int sum = sum(10,20);//20
		int avg = sum/2;
		return avg;
		 
	}
	
	public static void main(String[] args) {
		ReturnTypeMethods obj = new ReturnTypeMethods();
		
//		System.out.println(obj.a);//0
//		System.out.println(obj.b);//0
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter number1");
//		obj.a=scn.nextInt();//100
//		System.out.println("Enter number2");
//		obj.b=scn.nextInt();//300
		 
		System.out.println(obj.avg());

	}

}
