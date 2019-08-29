package StringPkg;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str1=scn.nextLine();
		
		System.out.println("Enter the string to replace with *");
		String str2=scn.nextLine();
		
		if(str1.contains(str2))
		{
			int position = str1.indexOf(str2);
			char [] ch= str1.toCharArray();
			
			for(int i=position; i<(position+str2.length());i++)
			{
				ch[i]='*';
			}
			
			String str3=new String(ch);
			System.out.println(str3);
		}
		else
		{
			System.out.print("String does not contain sub-string");
		}

	}

}
