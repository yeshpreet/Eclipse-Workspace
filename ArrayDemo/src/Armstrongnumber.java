import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter how many digits of Armstrong you want to check:");
		int d= scn.nextInt();
		System.out.print("Enter any " +d+" digit number:"); //153
		int num=scn.nextInt();
		int num1=num;
		int sum=0;
		for( int i=1; i<=d;i++) {
		int r= num%10;
		int q= num/10;
		int a=1;
		for ( int j=1; j<=d; j++) {
		a=a*r;
		}
		sum=sum+a;
		r=q;
		num=q;
		}
		if (num1==sum) {
			System.out.print(num1+" is Armstrong Number");
			}
		else {
			System.out.print(num1+" is not Armstrong Number");
		}
		
	}

}
