import java.util.Arrays;
import java.util.Scanner;

public class BuiltinSorting {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size = scn.nextInt();
		int[] arr= new int[size];
		for ( int i=0; i<arr.length; i++) {
			System.out.print("Enter the "+i+" array:");
			int val= scn.nextInt();
			arr[i]=val;
		}
		System.out.println(" Array is :"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array is :"+Arrays.toString(arr));
		
	}

}
