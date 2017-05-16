require_relative 'mediator'
require_relative 'seller'
require_relative 'buyer'

mediator = Mediator.new
dollarSeller = Seller.new(mediator, "USD", 100)
euroSeller = Seller.new(mediator, "EUR", 100)
gbpSeller = Seller.new(mediator, "GBP", 100)
rsSeller = Seller.new(mediator, "INR", 80)

gbpBuyer = Buyer.new(mediator, "GBP")
gbpBuyer.attemptToPurchase(79)
rsBuyer = Buyer.new(mediator, "INR")
rsBuyer.attemptToPurchase(20000)