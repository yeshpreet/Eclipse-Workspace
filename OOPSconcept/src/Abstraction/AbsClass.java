package Abstraction;

public abstract class AbsClass {
	int a=10;
	
	abstract public void absmethod();

	public void nonabsmethod() {
		System.out.println("Non Abstaract method in AbsClass");
	}
	

}
