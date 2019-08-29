import java.util.Arrays;

public class Stringelementtostar {

	public static void main(String[] args) {
	String st="Testing";
	System.out.println("String is" +st);
	st= st.toLowerCase();
	System.out.println("Conversion to lower case."+st);
	char[] ch=st.toCharArray();
	System.out.println("String to Array conversion"+Arrays.toString(ch));
	String st1= "*";
	char[] ch1=st1.toCharArray();
	String st2="t";
	char[] ch2=st2.toCharArray();
	System.out.println("String 2nd"+Arrays.toString(ch1));
	for ( int i= 0; i<=ch.length-1; i++){
	if ( ch[i]== ch2[0]) {
		ch[i]= ch1[0];
	}
	else
		continue;
	}
	System.out.println(Arrays.toString(ch));
	}
} 