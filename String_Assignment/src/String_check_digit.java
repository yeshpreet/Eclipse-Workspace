import java.util.Scanner;

public class String_check_digit {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scn.nextLine();
	      if(str.matches("[0-9]+") && str.length() > 2) {
	         System.out.println("String contains only digits!");
	      } else {
	         System.out.println("String contains digits as well as other characters!");
	      }

	}

}
