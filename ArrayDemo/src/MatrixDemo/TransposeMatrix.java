package MatrixDemo;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] arr= {{1,1,1}, {2,2,2}, {3,3,3}};
		System.out.println("Array is: ");
		for(int i=0; i<arr.length;i++) {
			for( int j=0; j<arr.length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Transpose of an Array is: ");
		for(int i=0; i<arr.length;i++) {
			for( int j=0; j<arr.length;j++) {
				System.out.print(" "+arr[j][i]);
			}
			System.out.println(" ");
		}
	}
}

	