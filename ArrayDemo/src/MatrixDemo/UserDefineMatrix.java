package MatrixDemo;
import java.util.Scanner;

public class UserDefineMatrix {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int r = scn.nextInt();
		System.out.print("Enter the number of columnss:");
		int c = scn.nextInt();
		int[][] arr= new int[r][c];
		System.out.println("Enter the Matrix:");
		for(int i=0; i<r;i++) {
			for (int j=0;j<c;j++) {
				arr[i][j]=scn.nextInt();
				System.out.print(" ");	
			}
		}
		System.out.println("Matrix is:");
		for (int i=0; i<r;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
	}

}
