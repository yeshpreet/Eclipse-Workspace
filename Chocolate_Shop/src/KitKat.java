
public interface KitKat {
	String k="KitKat";
	
	public default int Qty2(int qt, int x) {
		x=x-qt;		
		System.out.println("KitKat left in stock: "+x);
		return x;
	}
}
