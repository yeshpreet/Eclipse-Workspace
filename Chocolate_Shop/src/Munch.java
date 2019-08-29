
public interface Munch {
String m="Munch";




	public default int Qty1(int qt, int x) {
		x=x-qt;		
		System.out.println("Munch left in stock: "+x);
		return x;
	}
}
