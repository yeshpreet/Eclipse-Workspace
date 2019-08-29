import java.util.Arrays;
import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		int sum=0;
		System.out.print("Enter the size:");
		Scanner scn= new Scanner(System.in);
		int size = scn.nextInt();  
		int[] arr= new int[size];
		for (int i=0; i<size; i++) {
			System.out.print("Enter the "+i+" value of array:");
			int val = scn.nextInt();
			arr[i]=val;
			sum=sum+arr[i];
		}
		System.out.println( Arrays.toString(arr));
		System.out.println("Sum of all the array elements:" +sum);
		

	}

}
