package ExampleABCDE;

public class MainDclass extends CAbsclass {
	public void absmethod() {
		System.out.println("enter main method in Main class");
		CAbsclass.m4();	
	}
	public static void main(String[] args) {
		MainDclass obj=new MainDclass();
		System.out.println("Main class");
		obj.absmethod();
		Eclass.m3();  
		Eclass obj1=new Eclass();
		obj1.nonstaticmethod();
	} 
}
