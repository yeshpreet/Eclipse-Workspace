 package fordemo;

public class starhyphen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print("-");
			}
			for (int st=1; st<=i; st++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
