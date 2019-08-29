package Inheritance;

public class SingleInherit extends SingleInherits {

	public void SingleInherit() {
		
		System.out.println("Child Inherit");
	}
	public SingleInherit() {
		System.out.println("Child Const");
	}
	public  static void main (String[] args) {
		SingleInherit obj=new SingleInherit();
		obj.SingleInherits();
		obj.SingleInherit();
	}
}
