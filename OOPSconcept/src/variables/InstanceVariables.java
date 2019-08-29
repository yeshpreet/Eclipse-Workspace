 package variables;

public class InstanceVariables {
int x; //instance variable
int y=10;
	public static void main(String[] args) {
		//System.out.println(x); // compilation error
		InstanceVariables obj=new InstanceVariables(); //creating object
		//System.out.println(obj.x);// output=0
	InstanceVariables obj1= new InstanceVariables();
	obj1.y=100;
	System.out.println(obj.y);// 10 when y=10:
	System.out.println(obj1.y);//10 when y=10:  100 when obj1.y=100 defined
	}
	
/*public void nonstaticMethod() { //user defined method
	System.out.println(x);//no error and output is nothing (blank)
	// to call x or to print x  we need to use/call method.
	
}*/
/*public static void nonStaticMethod() {
	InstanceVariables obj=new InstanceVariables();
	System.out.println(obj.x);// no output untill or unless call under main method
}*/
}