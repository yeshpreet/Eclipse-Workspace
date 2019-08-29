package Variables;

public class VariablesInsideTheClass {
	int x=100;// instance->0
	static String y="static var"; 
	
	public static void m1() {
		VariablesInsideTheClass obj = new VariablesInsideTheClass();
		
		System.out.println(obj.x);
	}
	public static void main(String[] args) {
		 VariablesInsideTheClass obj = new VariablesInsideTheClass();
		 System.out.println(obj.x);//0
		 System.out.println(y);//0

	}

}
