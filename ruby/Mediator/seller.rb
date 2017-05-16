class Seller
  attr_accessor :mediator
  attr_accessor :currency
  attr_accessor :sellingPrice
  def initialize(mediator, currency, sellingPrice)
    @mediator = mediator
    @currency = currency
    @sellingPrice = sellingPrice
    @mediator.addSeller(self)
  end

  def getSellingPrice
    return sellingPrice
  end

  def setSellingPrice(sellingPrice)
    @sellingPrice = sellingPrice
  end

  def isBidAccepted(bidInDollars)
    if (bidInDollars <= sellingPrice)
      print "Seller accepts the bid of USD #{bidInDollars} .\n"
      return true
    else
      print"Seller rejects the bid of USD  #{bidInDollars}.\n"
    return false
    end
  end
end