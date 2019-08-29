package variables;

public class StaticVariables {
static int x;
	public static void main(String[] args) {
		StaticVariables obj=new StaticVariables();
		System.out.println(obj);
		StaticVariables obj1=new StaticVariables();
		System.out.println(obj1);
		obj.x=100;
		System.out.println(obj.x);
		System.out.println(obj1.x);

		System.out.println(x); //use of static word in front of int: default value 0
		System.out.println(StaticVariables.x);// can be accessed with class name
	}
	public static void nonStaticMethod() {
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.x);
}
}
