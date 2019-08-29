import java.util.Arrays;
import java.util.Scanner;

public class sortingofarray {

	public static void main(String[] args) {
		int[] arr= new int[] {10,4,30,60};
		int temp=0;
		System.out.println("Array is:"+Arrays.toString(arr));
		for ( int i=0; i<arr.length; i++) {
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
		
		
		
	
		
	
	

		
		
	
