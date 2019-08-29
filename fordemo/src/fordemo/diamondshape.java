package fordemo;

public class diamondshape {

	public static void main(String[] args) {
		int n=5;
		int l;
		int m = 0;
		
		for (int i=1; i<=n; i++) {
			
			if (i<=(n+1)/2) {
				 l=((n+1)/2)-i;
				 m=i;
			}
			else {
				 l=i-(n+1)/2;
				 m--;
				}
			
			for (int sp=1; sp<=l; sp++) {
				System.out.print(" ");
			}
			for (int st=1; st<=m; st++) {
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}
			
		
	}
	}


