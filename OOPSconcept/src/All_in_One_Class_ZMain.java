import java.util.Scanner;

public class All_in_One_Class_ZMain   {
	private int x;//89
	
	public  int setm1(int x) {
		this.x=x;
		System.out.println("Private integer x=z:"+x);
		return x;
	}	
	public static void main(String[] args) {
		All_in_One_Class_Z obj = new All_in_One_Class_Z(10);
		//All_in_One_Class_Z obj1=new All_in_One_Class_Z(10);
		//obj.met1();
		obj.met2(99);
		obj.met1();	 
		//All_in_One_Class_Z.met3();
		//All_in_One_Class_Z.met4(12);	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of z:");
		int z= scan.nextInt();//89
		//System.out.println(z);
		//System.out.println(obj.y);	
		All_in_One_Class_ZMain me1=new All_in_One_Class_ZMain();
	//	System.out.println("value of z="+z);
		me1.setm1(z);
		System.out.println(obj.x);//99
		
		System.out.println(me1.x);//89
		 
	}

}
