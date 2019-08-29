package fordemo;

public class pyramidstarequalrow {

	public static void main(String[] args) {
		int n=5;
		for (int i=1; i<=n; i++) {
			for (int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for (int st=1; st<=i; st++) {
				System.out.print(" *");
			}
			for (int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
