import java.util.Arrays;
import java.util.Scanner;

public class onearraytoanother {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("enter size:");
		int size= scn.nextInt();
		int[] arr= new int[size];
		int[] arr1= new int [size];
		for (int i=0; i<size; i++) {
			System.out.print(" Enter the"+i+"value:");
			int val= scn.nextInt();
			arr[i]=val;
				
			arr1[i]=arr[i];
		}
		System.out.println(" First array is " +Arrays.toString(arr));
		System.out.println("second array " +Arrays.toString(arr1));
	}

}
