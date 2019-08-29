package Arrays;

import java.util.Arrays;

public class BasicsArray {

	public static void main(String[] args) {
		 //Array Declaration and specified size 
		int n=10;
		int[] arr = new int[n];
//		System.out.println(arr);//[I@52e922
//		System.out.println(arr[3]);
		//System.out.println(arr[5]);
		
		// assign the values to an array
//		arr[0]=12;
//		arr[4]=67;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[2]);
		//12,0,0,0,67
		
		System.out.println("Length of an array"+arr.length);
		
		
		System.out.println(Arrays.toString(arr));
		//[0-10]
		//i=0-9
		for(int i=0;i<n;i++) {
			arr[i]=i;
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
