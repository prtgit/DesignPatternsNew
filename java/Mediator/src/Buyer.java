

public class Buyer {
	Mediator mediator;
	String currency;

	public Buyer(Mediator mediator, String currency) {
		super();
		this.mediator = mediator;
		this.currency = currency;
		mediator.addBuyer(this); // blank 
	}

	public boolean attemptToPurchase(float bid) {
		System.out.println("Buyer attempting a bid of " + currency +" " + bid + " .");
		return mediator.placeBid(bid, currency); // blank
	}
	
}