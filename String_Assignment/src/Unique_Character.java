import java.util.Scanner;

public class Unique_Character {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		for (int i = 0; i < str.length(); i++) 
            for (int j = i + 1; j < str.length(); j++) 
                if (str.charAt(i) == str.charAt(j)) {
                	System.out.println(str.charAt(i));
                    System.out.println(str.charAt(j));
                	System.out.println("String is not Unique")
                
                ;
                }
         else {
        	 System.out.println(str.charAt(i));
             System.out.println(str.charAt(j));
                	System.out.println("String is Unique");
        } 
	}
}
