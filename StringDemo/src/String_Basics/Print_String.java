package String_Basics;

public class Print_String {

	public static void main(String[] args) {
		String a="Good Morning";
		String b="Class";
		System.out.println(a+" "+b); // connect two strings
		System.out.println(a.equals(b)); // check whtere two strings are equal or not
		System.out.println(a.concat(b)); // concatenate two strings
		System.out.println(b.concat(" "+a)); // concatenate two strings with space
		System.out.println(a.equalsIgnoreCase(b)); //Ignoring case sensitivity
		System.out.println(a.toLowerCase()); // convert string to lower case
		System.out.println(b.toUpperCase()); // convert string to upper case
		char c= 'z';
		System.out.println(a+b+c);
		System.out.println(a.chars());
		
		
	}

}
