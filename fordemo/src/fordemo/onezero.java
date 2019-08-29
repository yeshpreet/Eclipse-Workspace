package fordemo;

public class onezero {

	public static void main(String[] args) {
		int n=4;
		for (int i=1; i<=n; i++) {
			for( int on=1; on<=n   ; on++) {
				if (i==on) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println(" ");
		}
	}

}
