package Second_Try;

import java.util.Scanner;

public class Choco_Shop {

	public Choco_Shop() {
		System.out.println("Welcome to AtoZ Chocolate shop.");
		System.out.println("Are you here to shop for Chocolate?");
		System.out.println("If Yes press 1 or if No press 0.");
		Scanner scn=new Scanner(System.in);
		int opt=scn.nextInt();
		if (opt==1) {
			System.out.println("We have the following Chocolates in Stock.\n"+
					"1.Dark Milk Chocolate\n2.Milk Chocolate\n3.White Chocolate.\n"+
					"4.Oreo Chocolate\n5.Raisin Chocolate");
			}
		else if (opt==0) {
				System.out.println("Thank you for visiting AtoZ Chocolate Shop");
			}
		else {
			System.out.println("Please select the correct option i.e 0 or 1.");
			}
		}
	
	public static void main(String[] args) {
		Choco_Shop obj = new Choco_Shop();
		Scanner scn =new Scanner(System.in);
		System.out.println("Which Chocolate you want to buy from above list?");
		System.out.println("Press 1 for Dark Milk Chocolate\nPress 2 for Milk Chocolate\n"
		+"Press 3 for White Chocolate\nPress 4 for Oreo Chocolate\nPress 5 forRaisin Chocolate");
		int Choco_opt=scn.nextInt();
		System.out.println("Enter the quantity of chocolate you want to order.");
		int qty=scn.nextInt();
		if (Choco_opt==1) {
			
		}
		else if (Choco_opt==2) {
			
		}
		else if (Choco_opt==3) {
			
		}
		else if (Choco_opt==4) {
	
		}
		else if (Choco_opt==5) {
	
		}
		else {
	System.out.println("Please select the Correct option.");
}
		
		
		
		
	}

}
