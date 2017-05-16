

public class Seller {
	
	Mediator mediator;
	String currency;
	int sellingPrice;
	int sellingPriceInDollars;
	
	public Seller(Mediator mediator, String currency, int sellingPrice) {
		super();
		this.mediator = mediator;
		this.currency = currency;
		this.sellingPrice = sellingPrice;
		mediator.addSeller(this); //blank
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public boolean isBidAccepted(float bidInDollars) {
		if (bidInDollars <= sellingPrice) {
			System.out.println("Seller accepts the bid of USD " + bidInDollars + ".\n");
			return true;
		} else {
			System.out.println("Seller rejects the bid of USD " + bidInDollars + ".\n");
			return false;
		}
	}
}
