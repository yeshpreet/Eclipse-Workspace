 package Encapsulation;

public class MainClass {
int x;

public void Example (int x) {
	this.x=x;
	System.out.println(x);
}
	public static void main(String[] args) {
		MainClass obj1=new MainClass();
		EncapConst obj=new EncapConst();
		int x=10;
		System.out.println(obj1.x);
		obj.SetXvalue(x);
		obj1.Example(x);
		System.out.println(obj1.x);
	}

}
