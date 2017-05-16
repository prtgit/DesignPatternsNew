This is an example of Mediator pattern.

Here, 'Mediator' class is acting as a mediator between sellers and buyers for currency
exchange. Note that buyer is contacting seller through the mediator, not the other way.

So, the flow of any transaction is- Buyer shows interest in buying some amount of currency
to the mediator, then mediator checks if any seller with the desired currency is selling
equal or less than the price buyer has proposed, and if there is then sends bid acceptance message
to buyer.

Both buyer and seller do not have to worry about the current currency rates and coversion.
It is handled by the 'CurrencyCoverter' class.

As exercise, you have to fill in the blanks, and after completing all the program, the 
expected output is like below:

Buyer attempting a bid of GBP 79.0 .
Seller accepts the bid of USD 99.07198.

Buyer attempting a bid of INR 20000.0 .
Seller rejects the bid of USD 309.88535.


Note: You need to implement mediator pattern for this example, not pertaining answers will not
be expected as correct even if the output matched the expected output.

  