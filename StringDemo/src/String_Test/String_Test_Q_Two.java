package String_Test;

public class String_Test_Q_Two {

	public static void main(String[] args) {
		int array_variable[]=new int[10];
		for (int i=0; i<10;++i) {
			array_variable[i]=i/2;
			array_variable[i]++;
			System.out.println(array_variable[i]+"-");			
			i++;
		}

	}

}
