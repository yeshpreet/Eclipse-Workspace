import java.util.Scanner;

public class ReversenumberDynamic {

	public static void main(String[] args) {
			int rev=0;
			int temp;
			int a;
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter any Number:");
			int d= scn.nextInt();
			temp=d;
			for ( int i=0; i<10;i++) {	
				a=temp%10;
				rev= rev*10+a;
				temp=temp/10;
				if (temp==0) {
					break;
				}
			}
			System.out.println("Reverse of number "+d+" is: " +rev);
	}

}
