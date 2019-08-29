package MatrixDemo;

import java.util.Scanner;

public class UserDefinedAdd {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int r = scn.nextInt();
		System.out.print("Enter the number of columnss:");
		int c = scn.nextInt();
		int[][] arr= new int[r][c];
		int[][] arr1=new int[r][c];
		int[][] addarr= new int[r][c];
		System.out.println("Enter the first Matrix:");
		for(int i=0; i<r;i++) {
			for (int j=0;j<c;j++) {
				arr[i][j]=scn.nextInt();
				System.out.print(" ");	
			}
		}
		System.out.println(" First Matrix is:");
		for (int i=0; i<r;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Enter the Second Matrix:");
		for(int i=0; i<r;i++) {
			for (int j=0;j<c;j++) {
				arr1[i][j]=scn.nextInt();
				System.out.print(" ");	
			}
		}
		System.out.println(" Second Matrix is:");
		for (int i=0; i<r;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Addition of two matrix is:");
		for (int i=0; i<r;i++) {
			for (int j=0;j<c;j++) {
				addarr[i][j]= arr[i][j]+arr1[i][j];
				System.out.print(" "+addarr[i][j]);
				}
			System.out.println(" ");
}
	}

}
