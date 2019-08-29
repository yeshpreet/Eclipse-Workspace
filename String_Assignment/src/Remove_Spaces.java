import java.util.Scanner;

public class Remove_Spaces {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scn.nextLine();
		
		String Str = str.replaceAll(" ", ""); // using built in method  
        System.out.println(Str);  
		
//		// i was trying this
//		 char str1[] = str.toCharArray(); 
//		int count=0;
//		for (int i = 0; i<str.length(); i++) {
//	        if (str1[i] != ' ') {
//	            str1[count] = str1[i]; 
//	          count++;
//	        }
//	       
//		}
//	System.out.println(str1);
//	
		}
}
