
public class All_in_One_Class_Z 
{
	int x;
	static int y=11;
	private int z=33;
	
	All_in_One_Class_ZMain main = new All_in_One_Class_ZMain();
	
	//Non static Block
	{
		//System.out.println("All_in_One_Class_Z-Non Static Block");
	}
	//Method
	public void met1() {
		int a= z;
		System.out.println("private int z="+a);
		}
	public void met2(int x) {
		main.setm1(x);
		System.out.println("Private value"+x);
		//this.x=x; 
		//System.out.println("All_in_One_Class_Z-Met2 method"+x);
	}
	public static void met3() {
		//System.out.println("All_in_One_Class_Z-Static Method");
	}
	public static void met4(int y) {
	
		//System.out.println("All_in_One_Class_Z- Static method parametric"+y);
	}
	//default constructor
	All_in_One_Class_Z(){
		//System.out.println("All_in_One_Class_Z Default Constructor");
	}
	// parametric constructor
	All_in_One_Class_Z(int x){
		//this();
		//System.out.println("All_in_One_Class_Z- PArametric COnstructor "+x);
	}

	

}
