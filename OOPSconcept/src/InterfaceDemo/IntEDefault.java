package InterfaceDemo;

public interface IntEDefault {
	public default void m3() {
		System.out.println("Interface E method  m3");
	}
	public default void m4() {
		System.out.println("Interface D method  m4");
	}

}
