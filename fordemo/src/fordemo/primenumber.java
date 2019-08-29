package fordemo;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter any number:");
		int num=scn.nextInt();
		int flag=0;
		for ( int i=2; i<num;i++) {
			if (num%i==0) {
				System.out.println("number is divisible by " +i);
				flag=1;
				break;
			}
			else {
			System.out.println("not divisible by"+i);
			}
		}
		if (flag==1) {
		System.out.println(num+" is Not Prime number");
		}
		else {
		System.out.println(num+" is Prime Number");
		}
		
	}

}
