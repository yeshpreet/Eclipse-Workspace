package Inheritance;

public class C extends B {
	public C() {
		System.out.println("C Constructor");
	}
	public void C() {
		System.out.println("C method");
	}
	public static void main(String[] args) {
		C obj=new C();
		obj.B();
		obj.C();
		obj.A();
	}

}
