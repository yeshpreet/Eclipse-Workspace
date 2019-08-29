package StringPkg;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str="aILent";
		String str1 = "listeng";
		
		int l1 = str.length();
		System.out.println(l1);
		//Step1
		if(str.length()==str1.length()) {
			//Step2
			str =  str.toLowerCase();
			str1 = str1.toLowerCase();
			
			//step3
			char[] ch = str.toCharArray();//[s, i, l, e, n, t]
			char[] ch1 = str1.toCharArray();//[s, i, l, e, n, t]
			
			//step4
		    Arrays.sort(ch);	//[a,i,l,n,s,t]
		    Arrays.sort(ch1);//[e,i,l,n,s,t]
		   
		    int flag=0;
		    
		    for(int i=0;i<ch.length;i++) {
		    	if(ch[i]!=ch1[i]) {
		    		 
		    	 
		    		System.out.println("enter in else ");
		    		flag=1;
		    		break;
		    	}
		    }
		    if(flag==1) {
		    	System.out.println("String is not an Anagram");
		    	
		    }else {
		    	System.out.println("String is anagram");
		    }
		    
		    
			
			 
			
			
		}else {
			System.out.println("Length of strings should be same");
		}

	}

}
