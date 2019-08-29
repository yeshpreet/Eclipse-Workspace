import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class removelementofarray {
	public static void main (String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size = scn.nextInt();
		int[] arr= new int[size];
		for ( int i=0; i<size; i++) {
			System.out.println("Enter the "+i+" array:");
			//int val= scn.nextInt();
			arr[i]= scn.nextInt();
		}
			System.out.println("Array is " +Arrays.toString(arr));
			
				System.out.println("Enter the index number of element you want to remove:");
				int index=scn.nextInt();
				
				arr[index]=0;
				System.out.println("Array after removing  " +index+"element:"+Arrays.toString(arr));
			
	}

}
