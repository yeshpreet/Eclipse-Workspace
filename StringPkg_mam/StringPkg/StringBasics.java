package StringPkg;

import java.util.Arrays;

public class StringBasics {

	public static void main(String[] args) {
		 String st="SDET TECHNOLOGY";
		 String st1="sdet TECHNOLOGY";
		 boolean res=st1.equalsIgnoreCase(st); 
		 
		 if(res) {
			 System.out.println("Matched");
		 }else {
			 System.out.println("Something Wrong");
		 }
		 
		 int size = st.length();//15
		 System.out.println(st.charAt(8));
		 
		 
		 
		
		 
	}

}
