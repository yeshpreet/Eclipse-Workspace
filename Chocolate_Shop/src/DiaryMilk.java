
public interface DiaryMilk {
	String d="Dairy Milk";
	
	public default int Qty3(int qt, int x) {
		x=x-qt;		
		System.out.println("Dairy Milk left in stock: "+x);
		return x;
	}
}
