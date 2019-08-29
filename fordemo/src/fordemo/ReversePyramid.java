package fordemo;

public class ReversePyramid {

	public static void main(String[] args) {
		
			int n=5;
			for (int i=1; i<=n; i++) {
				
				for (int sp=1; sp<=i-1; sp++) {
					System.out.print(" ");
				}
				for (int st=1; st<=n+1-i; st++) {
					System.out.print(" *");
				}
				for (int s=1; s<=i-1; s++) {
					System.out.print(" ");
				}
				System.out.println(" ");
			}

		}

	}
