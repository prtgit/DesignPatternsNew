import java.util.ArrayList;

public class Mediator {
	ArrayList<Buyer> buyersList = new ArrayList<Buyer>();
	ArrayList<Seller> sellerList = new ArrayList<Seller>();
	CurrencyConverter converter = new CurrencyConverter();
	
	public void addSeller(Seller seller){
		this.sellerList.add(seller);
	}
	
	public void addBuyer(Buyer buyer){
		this.buyersList.add(buyer);
	}

	public boolean placeBid(float bid, String unitOfCurrency) {
		boolean sellerAccepting = false;
		Seller seller = null;
		for (Seller eachSeller : sellerList) {
			if (eachSeller.currency.equals(unitOfCurrency) && eachSeller.sellingPrice != 0) {
				seller = eachSeller;
				sellerAccepting = true;
			}
		}
		if (!sellerAccepting) {
			System.out.println("Seller is not available for this currency/amount.");
			return sellerAccepting;
		}
		float dollarAmount = converter.convert(bid, unitOfCurrency);
		return seller.isBidAccepted(dollarAmount); // possible blank
	}
}
