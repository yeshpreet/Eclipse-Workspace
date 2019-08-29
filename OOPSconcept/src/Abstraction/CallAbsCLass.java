package Abstraction;

public class CallAbsCLass extends AbsClass {
	int z=109;
	
	public void absmethod() {
		System.out.println("Absmethod");
		System.out.print(super.a);// super prints parent class variable  
	}
	
	public CallAbsCLass() {
		System.out.println("Constructor");
	}
 
	public static void main(String[] args) {
		CallAbsCLass obj=new CallAbsCLass();
		System.out.println(obj.z);
		AbsClass obj1=new CallAbsCLass();
		System.out.println(obj1.a);
		obj1.nonabsmethod();
		obj.absmethod();

	}

}
