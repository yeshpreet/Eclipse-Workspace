import java.util.Arrays;
import java.util.Scanner;

public class lengthvaluearray {

	public static void main(String[] args) {
		System.out.print("enter size:");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int [size];
		for (int i=0; i<size; i++) {
		System.out.print(" enter value of " +i+ " array:");
			int	val = scn.nextInt();
		arr[i]= val;
		
		System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
			   
	}
}
