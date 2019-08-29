import java.util.Arrays;
import java.util.Scanner;

public class UserdefinedSorting {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size = scn.nextInt();
		int[] arr= new int[size];
		int temp=0;
		for ( int i=0; i<arr.length; i++) {
			System.out.print("Enter the "+i+" array:");
			int val= scn.nextInt();
			arr[i]=val;
		}
		System.out.println("Array is :"+Arrays.toString(arr));
		for(int i=0; i<arr.length;i++) {
		for ( int j=i+1; j<arr.length; j++) {
			if (arr[j]>arr[i]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}	
		}
		}
		System.out.println("Sorted Array is :"+Arrays.toString(arr));
	
	}

}
