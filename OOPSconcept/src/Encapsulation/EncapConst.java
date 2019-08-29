package Encapsulation;

import java.util.Scanner;

public class EncapConst {
 private int x;
private String y;


public void SetXvalue(int x) {
	this.x=x;
	System.out.println("Hello"+x);
	}
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value:");
		int x=scn.nextInt();
		EncapConst obj =new EncapConst();
		System.out.println(x);
		obj.SetXvalue(x);
		
	}

}
