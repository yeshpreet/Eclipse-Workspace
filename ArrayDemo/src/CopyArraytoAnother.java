import java.util.Arrays;

public class CopyArraytoAnother {

	public static void main(String[] args) {
	int arr[]= {6,7,8,9};
	int carr[]= new int[arr.length];
	System.out.println("Original Array is :"+Arrays.toString(arr));
	for ( int i=0; i<arr.length; i++) {
		carr[i]=arr[i];
	}
	
	System.out.println("Copied Array is :"+Arrays.toString(carr));
	}
	
}
