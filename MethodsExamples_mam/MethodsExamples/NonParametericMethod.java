package MethodsExamples;

public class NonParametericMethod {
	
	//Modifier returntype methodName(){
	//}
	
	//method Declaration
		//public void m1();
	// method definition
//		public void m1() {
//			//Statements
//		}
	// method calling
		//m1();
//	public  void add() {
//		int a=10;
//		int b=20;
//		int c=a+b;
//		System.out.println("Sum is "+c);
//	}
	
	
	public static void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	
	//builtin
	public static void main(String[] args) {
		NonParametericMethod obj = new NonParametericMethod();
		 System.out.println("Call Sum method");
		 sum();
		// obj.add();
		 System.out.println("End Execution");

	}

}
