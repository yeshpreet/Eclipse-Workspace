package fordemo;

public class sidepyramidnumber {

	public static void main(String[] args) {
		int n=5;
		
		int m=0;
		int num=1;
		for ( int i=1; i<=n; i++) {
			int l=0;
			if (i<=(n+1)/2) {
				l=((n+1)/2)-i;
				m=i;
			}
			else {
				l=i-((n+1)/2);
				m--;
			}
			for( int j=1; j<=m;j++) {
				System.out.print(2*num+" ");
				num++;
			}
		System.out.println(" ");
		}
	}

}
