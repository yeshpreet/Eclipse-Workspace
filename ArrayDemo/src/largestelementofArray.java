import java.util.Arrays;
import java.util.Scanner;

public class largestelementofArray {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size = scn.nextInt();
		int[] arr= new int[size];
		for ( int i=0; i<size; i++) {
			System.out.println("Enter the "+i+" array:");
			int val= scn.nextInt();
			arr[i]=val;
		}
			System.out.println("Arrayis " +Arrays.toString(arr));
			int max=0;
			for (int i=0; i<arr.length; i++) {
				if (arr[i]>max) {
					max=arr[i];
				}
			}
				System.out.println("Largest element of array is:" +max);
			int min = max;
			for (int i=0; i<arr.length; i++) {
				if (arr[i]<min) {
					min=arr[i];
				}
			}
				System.out.println("Smallest element of array is:" +min);
	}
}





