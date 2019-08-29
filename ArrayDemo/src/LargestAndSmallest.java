import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("enter size:");
		int size= scn.nextInt();
		int[] arr= new int[size];
		for (int i=0; i<size; i++) {
			System.out.print(" Enter the"+i+"value:");
			int val= scn.nextInt();
			arr[i]=val;
		}
		System.out.println(" The array is " +Arrays.toString(arr));
		//int[] arr1=new Int[];
		//arr1=Arrays.sort(arr);
		System.out.println(" The Sorted array is " +Arrays.toString(arr));

	}

}
