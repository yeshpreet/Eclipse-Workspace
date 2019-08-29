import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		//Without using Loop.
		//not dynamic
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter any 3 digit number:"); //123
		int num=scn.nextInt();
		int rev=0;
		int r1=num%10;//3
		int q1=num/10;//12
		int r2=q1%10;//2
		int q2=q1/10;//1
		rev=r1*100+r2*10+q2;
		if (num==rev) {
			System.out.print("Number is Pallindrome");
			}
		else {
			System.out.print("Number is not Pallindrome");
		}
	}
}
