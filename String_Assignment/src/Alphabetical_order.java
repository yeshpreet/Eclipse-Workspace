import java.util.Arrays;
import java.util.Scanner;

public class Alphabetical_order {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any word: ");
		String str= scn.nextLine();
		str = str.toLowerCase();
		System.out.println("Lower case: "+str);
		char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println("Sorted string " + String.valueOf(charArray));
    }
}
