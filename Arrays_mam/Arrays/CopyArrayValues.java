package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayValues {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scn.nextInt();
		 //Array Create
		int[] arr = new int[size];
		System.out.println(size);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(arr.length);
		
		//store the value at index i
	//	arr[0]=12;
		for(int i=0;i<size;i++) {
			System.out.println("Please enter value at index no"+ i);
			int val = scn.nextInt();
			arr[i]=val;
			System.out.println(Arrays.toString(arr));
			
		}
		//arr
		
		//[12, 45, 67, 89, 90]
//		12
//		45
//		67
//		89
//		90
		
		// second Array
		int[] arr2 = new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.println("First Array value"+arr[i]);
			arr2[i] = arr[i];
			System.out.println("scnd Array value"+arr2[i]);
		}
		
		 
		
		
		
		
		
		
		
		
		 
		
	}

}
