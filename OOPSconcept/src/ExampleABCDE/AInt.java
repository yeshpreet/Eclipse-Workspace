package ExampleABCDE;

public interface AInt extends BInt{
public static void m1() {
	System.out.println("A Static");
	BInt.m1();
}
}
