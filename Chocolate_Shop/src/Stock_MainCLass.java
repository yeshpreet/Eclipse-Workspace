import java.util.Scanner;

public class Stock_MainCLass implements Perk, KitKat, Munch, DiaryMilk, Cadbury_Silk {
int qt;
	

	public static void main(String[] args) {
	System.out.println("Welcome to Chocolate Shop.");
	Scanner scn=new Scanner(System.in);
	System.out.println("List of Chocolate in stock are here below.\n1.Munch.\n2. Perk.\n3. KitKat.\n4. Cadbury Silk.\n5. Diary Milk.");
	System.out.println("Enter the name of CHocolate you want to order.");
	String name= scn.nextLine();
	System.out.println("Quantity of chocolate you want to order: ");
	int qt= scn.nextInt();
	Munch obj=new Stock_MainCLass();
	Perk obj1=new Stock_MainCLass();
	KitKat obj2= new Stock_MainCLass();
	DiaryMilk obj3=new Stock_MainCLass();
	Cadbury_Silk obj4 = new Stock_MainCLass();
	int remqt=0;
	if (name.equals(Munch.m)) { 
		remqt=obj.Qty1(qt,20);
		
	if (remqt<=5) {
		System.out.println("Restock Munch Chocolate");
	}
	}
	else if (name.equals(Perk.p)) {
		remqt=obj1.Qty(qt,20);
	
	if (remqt<=5) {
	System.out.println("Restock Perk Chocolate");
	}
	}
	else if (name.equals(KitKat.k)) { 
		remqt=obj2.Qty2(qt,20);
		
	if (remqt<=5) {
		System.out.println("Restock KitKat Chocolate");
	}
	}
	else if (name.equals(Cadbury_Silk.c)) { 
		remqt=obj4.Qty4(qt,20);
		
	if (remqt<=5) {
		System.out.println("Restock Cadbury Silk Chocolate");
	}
	}
	else if (name.equals(DiaryMilk.d)) { 
		remqt=obj3.Qty3(qt,20);
		
	if (remqt<=5) {
		System.out.println("Restock Dairy Milk Chocolate");
	}
	}
	}
}
