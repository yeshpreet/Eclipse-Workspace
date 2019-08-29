package variables;

public class VariablesDemo {
int x;
static int y;
VariablesDemo obj2;
	public static void main(String[] args) {
	VariablesDemo obj1 = null; //unreffered
		VariablesDemo obj = new VariablesDemo();
		int z=1;
		System.out.println(obj.x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(obj1);
		//System.out.println(obj2); // compilation error
		System.out.println(obj.obj2);
	}
public void nonStaticMethod() {
	System.out.println(x);
	System.out.println(y);
	//System.out.println(z);// outside blockl coz its a local variable
}
}
