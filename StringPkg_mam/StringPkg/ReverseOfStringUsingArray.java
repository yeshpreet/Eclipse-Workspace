package StringPkg;

public class ReverseOfStringUsingArray {

	public static void main(String[] args) {
		 String st="SDET TECHNOLOGY";
		 //count string length by using length() method
		 int size = st.length();
		 //Defining Array Size
		 char[] ch = new char[size];
		 
		 // Convert string to array
		 ch = st.toCharArray();
		 // traverse loop in reverse order 
		 for(int i=size-1;i>=0;i--) {
			 
			 //printing the array elements
			 System.out.println(ch[i]);
		 }
	}

}
