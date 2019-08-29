package MethodsExamples;

import java.util.Scanner;

public class ParametericMethod {
	 int a;//34
	 int  b;
	 
	 //method with fomal parameters
	public static  void sum(int x, int y) {
		int c= x+y;
		System.out.println("Sum is "+c);
	 
	} 
	
	public static void main(String[] args) {
		ParametericMethod obj = new ParametericMethod();
//		 obj.a=100;
//		 obj.b=200;
		 
		System.out.println("Instance Variable "+obj.a);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of a");
		//int a = scn.nextInt();//5
		obj.a = scn.nextInt();//5
		
		System.out.println("Enter value of b");
		int b = scn.nextInt();//10
		
		
		 sum(obj.a,b);// actual parameters
		 System.out.println(obj.a);//
	 
		
		 

	}

}
