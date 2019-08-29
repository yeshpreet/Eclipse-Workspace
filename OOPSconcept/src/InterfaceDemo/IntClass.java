 package InterfaceDemo;

public class IntClass implements I2 {

	public void m1() {
		System.out.println("Class implements I1");
		
	}
	public void m2() {
		System.out.println("Class implements I2 extended with I1");			
	}
	public static void main(String[] args) {
		IntClass obj =new IntClass();
		obj.m1();
		obj.m2();
	}	

}
