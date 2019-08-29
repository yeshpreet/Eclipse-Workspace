package variables;

import java.util.Scanner;

public class MethodReturnDemo {
	int a;
	int b;
	public int sum(int a, int b) {
		int	c=a+b;
		return c;
	}
	
	
	public int avg(int x, int y) {
		int sRes = sum(x,y);
		int avg = sRes/2;
		//System.out.println("Average="+avg);
		return avg;
	}
	
	

}
