import java.util.Scanner;

public class Reverse_sentence {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scn.nextLine();
		String[] words = str.split(" ");
		String Revstr="";
		for (int i = words.length-1; i >= 0; i--)
		{
		 Revstr = Revstr + words[i] + " ";
		}
System.out.println("You Entered String: "+str);
System.out.println("Reversed String is: "+Revstr);
	
	
	}
}
