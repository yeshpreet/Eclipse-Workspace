package fordemo;

public class pyramid { 

	public static void main(String[] args) {
		int n=5;
		int num=1;
		for (int i=1; i<=n; i++)
		{
			for (int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for ( int st=1; st<=num; st++)
			{
				System.out.print("*");
			}
			num=num+2;
	
		System.out.println(" ");
		}
	}

}
