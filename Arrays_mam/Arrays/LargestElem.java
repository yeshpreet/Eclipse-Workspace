package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter Size of an array");
		int size = scn.nextInt();
		 int[] numbers = new int[size];
		 for(int i=0;i<size;i++) {
			 System.out.println("Please enter "+i+" element");
			 int val = scn.nextInt();
			 numbers[i]=val; 
			 System.out.println("value of "+i+"element"+numbers[i]);
			 System.out.println(Arrays.toString(numbers));
		 }
		 
		 //numbers->[12, 34, 78, 90]
		 
		 for(int j=0;j<numbers.length;j++) {
			// System.out.println(numbers[j]);
			 
		 }
		 
		 
		 

	}

}
