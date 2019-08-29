import java.util.Arrays;
import java.util.Scanner;

public class ReverseofArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size= scn.nextInt();
		int[] arr= new int[size];
 		int[]arr1= new int[size];
		for (int i=0; i<size; i++) {
			System.out.println("Enter the " +i+ " value of array");
			int val= scn.nextInt();
			arr[i]=val;
			}
		System.out.println("Initial Array is-" +Arrays.toString(arr));
		
		for (int i=arr.length-1; i>=0; i--) {
			arr1[arr.length-1-i]=arr[i];
			
		}
		System.out.println(" Reverse of an array is- " +Arrays.toString(arr1));
		
		

	}

}
