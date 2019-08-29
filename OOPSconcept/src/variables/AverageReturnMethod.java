package variables;

import java.util.Scanner;

public class AverageReturnMethod {
	int a;
	int b;
	public int sum() {
	int	c=a+b;
		return c;
	}
	public int sub() {
		int d= a-b;
		return d;
	}
	public int avg() {
		int sum= sum();
		int sub= sub();
		int avg = (sum+sub)/2;
		System.out.println("Average="+avg);
		return avg;
	}
	public static void main(String[] args) {
		AverageReturnMethod obj=new AverageReturnMethod();
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter valueof a=");
		obj.a= scn.nextInt();
		System.out.println("Enter value of b=");
		obj.b=scn.nextInt();
		System.out.println("a= "+obj.a);
		System.out.println("b="+obj.b);
		int sumRes = obj.sum();
		System.out.println("Sum="+sumRes);
		int subRes= obj.sub();
		System.out.println("Sub="+subRes);
		obj.avg();
		}

}
