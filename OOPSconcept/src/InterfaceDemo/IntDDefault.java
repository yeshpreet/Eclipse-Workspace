package InterfaceDemo;

public interface IntDDefault  {
	public default void m3() {
		//IntEDefault.super.m3();
		System.out.println("Interface D method  m3");
	}
}
