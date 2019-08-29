
public interface Perk {
	String p="Perk";




	public default int Qty(int qt, int x) {
		x=x-qt;		
		System.out.println("Perk left in stock: "+x);
		return x;
	}
}
