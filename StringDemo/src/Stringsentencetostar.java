import java.util.Arrays;
import java.util.Scanner;

public class Stringsentencetostar {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str= scn.nextLine();
		System.out.print("Enter the word you want to replace: ");
		String repstr= scn.nextLine();
		String[] strArr= str.split(" ");
		System.out.println("array "+Arrays.toString(strArr));
		String newstr=" ";
		for (int i=0; i<strArr.length; i++) {
			if(strArr[i].equals(repstr)) {
				int findstr= strArr[i].length();{
					for ( int j=0; j<findstr; j++) {   
						newstr+="*";
					}
					newstr+=" ";
				}
			}
			else {
					newstr+=strArr[i]+" ";
			}
		}
		System.out.println("New String is:"+newstr);
		}
}



