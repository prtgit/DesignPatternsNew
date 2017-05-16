require_relative 'currency_converter'

class Mediator
  def initialize
    @buyerList = Array.new
    @sellerList = Array.new
    @converter = CurrencyConverter.new
  end

  def addSeller(seller)
    @sellerList.push(seller)
  end

  def addBuyer(buyer)
    @buyerList.push(buyer)
  end

  def placeBid(bid, unitOfCurrency)
    sellerAccepting = false
    for eachSeller in @sellerList
        if (eachSeller.currency == unitOfCurrency) && (eachSeller.sellingPrice != 0)
            seller = eachSeller
            sellerAccepting = true
        end
    end
    if sellerAccepting == false
      print "Seller is not available for this currency/amount.\n"
      return sellerAccepting;
    end
    dollarAmount = @converter.convert(bid, unitOfCurrency)
    return seller.isBidAccepted(dollarAmount)

  end
end