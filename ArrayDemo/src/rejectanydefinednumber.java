import java.util.Arrays;
import java.util.Scanner;

public class rejectanydefinednumber {

	public static void main(String[] args) {
		System.out.print("enter size:");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int [size];
		for (int i=0; i<size; i++) {
		System.out.print(" enter value of " +i+ " array:");
			int	val = scn.nextInt();
		arr[i]= val;
		if (arr[i]==78)
			break;
		else
		System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr)); //display array
		//printing 78 coz syso is out of loop	   
	}

}
