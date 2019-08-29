
public class PrivateMethCheckChild extends PrivateMethCheckParent {

	public void m1() {
		System.out.println("Child method m1");
	}
	private void m1() {
		System.out.println("Parent Private method m1");
	}
	void m2() {
		System.out.println("Parent Private method m1");
	}
	protected void m3() {
		System.out.println("Parent Private method m1");
	}
	public void m4() {
		System.out.println("Parent Private method m1");
	}
	
	public static void main(String[] args) {
		
	}

}
