package variables;

import java.util.Scanner;

public class NonStaticMethod {
	int a;
	int b;
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum is: "+c);
	}
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction is: "+c);
	}
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println("Multiplication is: "+c);
	}
	public void div(int a, int b) {
		int c=a/b;
		System.out.println("Division is: "+c);
	}
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	NonStaticMethod obj= new NonStaticMethod();
	System.out.println("Enter the value a=");
	obj.a=scn.nextInt();
	System.out.println("Enter the value of b:");
	obj.b=scn.nextInt();
	obj.sum(obj.a,obj.b);
	obj.sub(obj.a,obj.b);
	obj.mul(obj.a,obj.b);
	obj.div(obj.a,obj.b);
	}

}
