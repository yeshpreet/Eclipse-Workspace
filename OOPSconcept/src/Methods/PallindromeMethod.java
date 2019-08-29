package Methods;

import java.util.Scanner;

public class PallindromeMethod {
		int a;
	public void ifelse() {
		 
	}
	public static void main(String[] args) {
		Reverse obj= new Reverse();
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any 3 digit number=");
		obj.a=scn.nextInt(); //a=123
		obj.Rev();
		if (obj.Rev()==obj.a) {
			System.out.println("Number is Pallindrome");
		}
		else {
			System.out.println("Number is not Pallindrome");
		}
	}

}
