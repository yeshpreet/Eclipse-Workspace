
public interface Cadbury_Silk {
	String c="Cadbury Silk";

	public default int Qty4(int qt, int x) {
		x=x-qt;		
		System.out.println("Cadbury Silk left in stock: "+x);
		return x;
	}
}
