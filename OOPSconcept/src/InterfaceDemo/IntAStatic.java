package InterfaceDemo;

public interface IntAStatic extends IntBStatic {
	public static void m1() {
		System.out.println("Interface A method  m1");
		IntBStatic.m1();
		IntBStatic.m2();
	
	}
}
