import java.util.Scanner;

public class Replace_Duplicate_Spaces {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scn.nextLine();
		char str1[] = str.toCharArray();
String str2=str.replaceAll("  "," ");
System.out.println("String withour duplicate space is: "+str2);
	}

}
