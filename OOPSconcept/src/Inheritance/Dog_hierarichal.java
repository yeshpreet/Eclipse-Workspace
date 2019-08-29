package Inheritance;

public class Dog_hierarichal extends Animal_hierarichal {
public void Woof() {
	System.out.print("- Dog says Woof.");
}
	public static void main (String[] args) {
		Dog_hierarichal o= new Dog_hierarichal();
		o.gen();
		o.Woof();
	}
}

