import java.util.Scanner;

public class Rev_WordinString {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scn.nextLine();
		String[] words = str.split(" ");
		String rev = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String revWord = "";
	           for (int j = word.length()-1; j >= 0; j--) {
			revWord = revWord + word.charAt(j);
		   }
		   rev = rev + revWord + " ";
		}
		System.out.println("String entered is: "+str);
		System.out.println("Reversed String is: "+rev);

	}

}
