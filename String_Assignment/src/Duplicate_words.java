import java.util.Scanner;

public class Duplicate_words {

	public static void main(String[] args) {
		//String string = "I Scream. You scream. We all scream. For an ice-cream.";  
		System.out.println("Enter a String:");
		Scanner scn=new Scanner(System.in);
		String string=scn.nextLine();
 
		System.out.println("String we are checking is: " +string);   
		 int count;
	        string = string.toLowerCase(); 
	        System.out.println("Lowers case: "+string);
	        
	        String str[] = string.split(" ");  
	        System.out.println("Splitting taking place.");
	        System.out.println("Checking duplicate words in a given string. ");   
	        for(int i = 0; i < str.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j < str.length; j++) {  
	                if(str[i].equals(str[j])) {  
	                    count++;  
	                 str[j] = "0";  
	                } 
	                
	            }  
	           //if there is duplicate word.
	            if(count > 1 && str[i] != "0")  
	                System.out.println("String has duplicate word: "+str[i]); 
	            System.out.println(str[i]+" came in the string "+count+" times.");
	        }  

	}

}
