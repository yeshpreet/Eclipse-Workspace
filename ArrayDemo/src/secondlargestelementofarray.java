import java.util.Arrays;
import java.util.Scanner;

public class secondlargestelementofarray {

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
				int secmax=0;
				int temp=0;
				for (int i=0; i<arr.length; i++) {
					if (arr[i]>max) {
						temp= arr[i];
						secmax=max;
						max=temp;
						
					}
				}
					System.out.println("Largest element of array is:" +max);
				 System.out.println("Second Largest element of array is" +secmax);
				
			

		}



	}


