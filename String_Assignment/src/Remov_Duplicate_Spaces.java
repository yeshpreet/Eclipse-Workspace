import java.util.Scanner;

public class Remov_Duplicate_Spaces {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scn.nextLine();
		
		String Str = str.replaceAll("  ", " "); // using built in method  
		System.out.println(Str);  
		
	}

}
