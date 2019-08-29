package fordemo;
import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Decimal Number:");
		int d= scn.nextInt(); //15
		String x="";
		int count=0;
		int one;
		while (d>0) {
			one=d%2;
		if (one==1) {
			count++;				
		}
		x=x+""+one;
		d=d/2;
		}
		System.out.println("Decimal number: "+d);
		//System.out.println("Number of 1's: "+count);
		System.out.println("Binary number is: "+x);

	}

}
