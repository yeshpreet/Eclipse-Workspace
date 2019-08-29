
public class Final_keyword {
final int a;
public Final_keyword() {
	a=19;//  we can initialize value of final in constructor not in method.  
}
	/*
	 * public void key_final() { 
	 * a=200; 
	 * System.out.println(a); }
	 */
	public static void main(String[] args) {
		Final_keyword obj = new Final_keyword();
		//obj.a=20; we cannot reassign final variables
		System.out.println(obj.a); 
	}

}
