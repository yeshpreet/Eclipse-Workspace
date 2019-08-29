package Inheritance;

public class Cat_hierarichal extends Animal_hierarichal {

	public void Meow() {
		System.out.print("- Cat says Meow.");
	}
		public static void main(String[] args) {
			Cat_hierarichal op= new Cat_hierarichal();
			op.gen();
			op.Meow();
	}
	}

