

class Buyer
  attr_accessor :mediator
  attr_accessor :currency

  def initialize(mediator,currency)
    @mediator = mediator
    @currency = currency
    mediator.addBuyer(self)
  end

  def attemptToPurchase(bid)
    print "Buyer attempting a bid of #{currency} #{bid}.\n"
    return mediator.placeBid(bid, currency)
  end
end