

public class MediatorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new Mediator();
		Seller dollarSeller = new Seller(mediator, "USD", 100);
		Seller euroSeller = new Seller(mediator, "EUR", 100);
		Seller gbpSeller = new Seller(mediator, "GBP", 100);
		Seller rsSeller = new Seller(mediator, "INR", 80);
		
		Buyer gbpBuyer = new Buyer(mediator, "GBP");
		gbpBuyer.attemptToPurchase(79);
		Buyer rsBuyer = new Buyer(mediator, "INR");
		rsBuyer.attemptToPurchase(20000);
	}

}
