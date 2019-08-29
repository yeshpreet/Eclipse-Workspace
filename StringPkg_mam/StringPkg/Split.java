package StringPkg;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		 String str = "email###id###name";
		 System.out.println(str);
		 String[] arr = null;
		 String[] sArr = str.split("###");//[]
		 System.out.println(Arrays.toString(sArr));
		 for(int i=0;i<sArr.length;i++) {
			 if(sArr[i].contains("###")) {
				arr =  sArr[i].split("###");
			 }
			 System.out.println(Arrays.toString(arr));
			 
			 System.out.println(sArr[i]);
		 }
		 

	}

}
