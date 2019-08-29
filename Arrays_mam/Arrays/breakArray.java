package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class breakArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scn.nextInt();
		 //Array Create
		int[] arr = new int[size];
		 
		 
		for(int i=0;i<size;i++) {
			System.out.println("Please enter value at index no"+ i);
			int val = scn.nextInt();
			arr[i]=val;
			
			if(arr[i]==78) {
				break;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
//		for(int i=0;i<arr.length;i++){
//			 
//			 
//			System.out.println("scnd Array value"+arr[i]);
//		}
		
		 
		
		
		
		
		
		
		
		
		 
		
	}

}
