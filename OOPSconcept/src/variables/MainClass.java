package variables;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		MethodReturnDemo obj=new MethodReturnDemo();
		AverageReturnMethod obj1 = new AverageReturnMethod();
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter valueof a=");
		obj.a= scn.nextInt();
		System.out.println("Enter value of b=");
		obj.b=scn.nextInt();
		 
		System.out.println(obj.avg(obj.a,obj.b));
		obj1.sub();
		}

}
