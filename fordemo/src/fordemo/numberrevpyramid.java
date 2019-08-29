package fordemo;

public class numberrevpyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n;i++){
			for (int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++){
				System.out.print(j);
			}
			for( int k=i-1; k>=1; k--){
				System.out.print(k);
			}
			System.out.println(" ");
		}
	}
}











		/*int n=5 ;
		int t=1;
		 
		for (int i=1; i<=n; i++) {
			for (int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
		for (int j=1; j<=t; j++) {
			int l=j;
			if (j<=(t+1)/2) {
			System.out.print(l);
			l++;
	}
		else {
			l=l-2;
			System.out.print(l);
		}
		}
		  t=t+2;
		System.out.println(" ");
	}

	}
}*/
