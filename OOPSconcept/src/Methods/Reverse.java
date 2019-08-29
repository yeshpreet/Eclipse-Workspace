package Methods;

import java.util.Scanner;

public class Reverse {
	int a;
	public int Rev() {
		int r1=a%10; //r1=7
		int b=a/10; //b=46
		int r2=b%10; // r2=6
		int r3=a/100; //r3=4
		int rnum= r1*100+r2*10+r3;
		//System.out.println(r1+""+r2+""+r3);
		return rnum;
	}

	public static void main(String[] args) {
		Reverse obj= new Reverse();
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any 3 digit number=");
		obj.a=scn.nextInt(); //a=467
		obj.Rev();
		System.out.println(obj.Rev());
	}

}
