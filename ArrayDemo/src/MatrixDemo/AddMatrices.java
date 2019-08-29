package MatrixDemo;

public class AddMatrices {

	public static void main(String[] args) {
		int[][] arr= {{1,1,1},{2,2,2},{3,3,3}};
		int[][] arr1={{4,4,4},{5,5,5},{6,6,6}};
		int[][] addarr= new int[3][3];
		System.out.println("Matrix 1 is:");
		for (int i=0; i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Matrix 2 is: ");
			for (int i=0; i<arr1.length;i++) {
				for (int j=0;j<arr1.length;j++) {
					System.out.print(" "+arr1[i][j]);
				}
				System.out.println(" ");
			}
		System.out.println("Addition of two mattrice is:");
		for (int i=0; i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				addarr[i][j]= arr[i][j]+arr1[i][j];
				System.out.print(" "+addarr[i][j]);
			}
			System.out.println(" ");
		}
	}

}
