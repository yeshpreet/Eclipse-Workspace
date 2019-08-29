import java.util.Arrays;

public class Anagramstring {

	public static void main(String[] args) {
		String st= "Silent";
		String st1="listens";
		//System.out.println("Step1-lcheck length");
		if(st.length()==st1.length()) {
			//System.out.println("step 2- conver to lowercase");
			st=st.toLowerCase();
			st1=st1.toLowerCase();
			//System.out.println(st);
			//System.out.println(st1);
			//System.out.println("Step3- convert to array.");
			char[] ch=st.toCharArray();
			char[] ch1=st1.toCharArray();
			//System.out.println("first string to array" +Arrays.toString(ch));
			//System.out.println("second string to array" +Arrays.toString(ch1));
			//System.out.println("Step 4 : sorting");
			Arrays.sort(ch);
			Arrays.sort(ch1);
			//System.out.println("String 1 after sorting"+Arrays.toString(ch));
			//System.out.println("String 2 after sorting."+Arrays.toString(ch1));
			
			int flag=0;
		//System.out.println("flag initialized and checking started");	
			for(int i=0; i<ch.length; i++) {
				if(ch[i]==ch1[i]) {
					flag=0;
				}
				else {
					flag=1;
					break;
				}
			}
			if ( flag==0) {
				System.out.println("String is Anagram");
			}
			else {
				System.out.println("String is not Anagram");
			}
		}
		else {
			System.out.println("Not Anagram as Length is not same.");
		}

	}

}
