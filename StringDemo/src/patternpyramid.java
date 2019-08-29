
public class patternpyramid {

	public static void main(String[] args) {
		int n=6 ;
		int a=1;
		int b=0;
		//for (b=1;b<=1;b++) {
			//System.out.println("*");
		for (int i=0; i<=n; i++) {
			int c=a+b;
			for (int j=1; j<=c; j++) {
			System.out.print("*");	
			}
			a=b;
			b=c;
			c=a+b;
		System.out.println("");
		}
		}
	}


		/*int a=1;
		int b=0;
		int c=0;
		for(int i=1; i<=7; i++) {
			c=a+b;
			a=b;
			b=c;
			for( int j=1;j<=c;j++) {
				System.out.print("*");	
			}
			System.out.println("");
		}
	}
}*/