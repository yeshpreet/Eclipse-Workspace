package fordemo;

public class triangleinsquare {

	public static void main(String[] args) {
		int n=4;
		int num=1;
		for (int i=1; i<=n; i++)
		{
			for (int sp=1; sp<=n-i; sp++) {
				System.out.print("-");
			}
			for ( int st=1; st<=num; st++)
			{
				System.out.print("*");
			}
			num=num+2;
			for (int hy=1; hy<=n-i; hy++) {
				System.out.print("-");
			}
	
		System.out.println(" ");
		}
	}

}
