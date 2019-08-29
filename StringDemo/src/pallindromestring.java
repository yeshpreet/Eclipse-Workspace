
public class pallindromestring {

	public static void main(String[] args) {
		String st="Mam";
		String str=""; 
		for (int i=st.length()-1; i>=0; i--)
		{
			str +=st.charAt(i);
			System.out.println(str);
		}
System.out.println(str);
if ( st.equalsIgnoreCase (str))
	System.out.println("Pallindrome");
else 
	System.out.println("Not Pallindrome");
	}

}
