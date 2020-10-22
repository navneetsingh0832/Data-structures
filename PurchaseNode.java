package col106.assignment5;

public class PurchaseNode implements PurchaseInterface{

	int numItemPurchased = 0;
	DateNode dateobj = null;

	public PurchaseNode(int numItems, int day, int month, int year){
		this.dateobj = new DateNode(day, month, year);
		numItemPurchased = numItems;
	}

	@SuppressWarnings("unchecked")
	public DateNode getDate(){
		return this.dateobj;
	}

	@SuppressWarnings("unchecked")
	public int numItemsPurchased(){
		return this.numItemPurchased;
	}

}
