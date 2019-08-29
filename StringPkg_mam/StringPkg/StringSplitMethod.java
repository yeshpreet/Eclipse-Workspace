package StringPkg;

import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {
		String str = "Automation testing id";
		String[] strArr = str.split(" ");//['aut','testing','id']
		String repStr = "id";
		
		String newStr = "";
		
		//traverse array elements- strArr
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].equals(repStr)) {
				System.out.println("enter if");
				int findStrLen = strArr[i].length();//2
				for(int j=0;j<findStrLen;j++) {
					newStr+="*";
				}
				newStr+=" ";
			}else {
				System.out.println("enter else");
				newStr= newStr + strArr[i]+" ";	 
			System.out.println(newStr);
			}
			
		}
		
		System.out.println(newStr);
		 

	}

}
