
public class lenghtarray {
	public static void main(String[] args) {
int n=100;
int[] arr= new int[n];
	for ( int i=0; i<n; i++)
		if (i%5==0) {
		 	arr[i]=i;
			System.out.println(arr[i]);
		}
		else
			continue;
}
}