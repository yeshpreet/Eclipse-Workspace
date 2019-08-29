package Variables;

import MethodsExamples.NonParametericMethod;

public class MainClass {
int x=50;
static int y;
	public static void main(String[] args) {
		MainClass obj = new MainClass();
		 System.out.println(obj.x);
		 
		 VariablesInsideTheClass obj1 = new VariablesInsideTheClass();
		 System.out.println(obj1.x);//0
		 
		 System.out.println(VariablesInsideTheClass.y);//0
		 
		 NonParametericMethod npm = new NonParametericMethod();
		 npm.add();
		 NonParametericMethod.sum();
	}

}
