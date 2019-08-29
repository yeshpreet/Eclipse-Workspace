import java.util.Arrays;
import java.util.Scanner;

public class duplicacyofarray {
	
	public static void main(String[] args) {
		
		int temp=0;
		
		//Scanner scn= new Scanner(System.in);
		//System.out.print("Enter the size of an array:");
		//int size = scn.nextInt();
		int[] arr= new int[] {1,1,1,2,2};

		for ( int i=0; i<arr.length; i++) {
			//System.out.print("Enter the "+i+" array:");
			//int val= scn.nextInt();
			//arr[i]=val;
			//System.out.println("Array is:"+Arrays.toString(arr));
		 
			int inc = 1;
		System.out.println("Array is:"+Arrays.toString(arr));			
		for ( int j=i+1; j<arr.length; j++) {
			
				if (arr[i]==arr[j]) {
					inc++;
					 
				}
	}
		System.out.println("element" +arr[i]+" came " +inc+ " times.");	
	}
		
	}
}