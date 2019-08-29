package fordemo;

public class revpyramid {

	public static void main(String[] args) {
		int num=5;
		int n=5;
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=(n+1)-i; j++) {
				System.out.print(num);
				
			}
			num--;
			System.out.println(" ");
		}

	}

}
