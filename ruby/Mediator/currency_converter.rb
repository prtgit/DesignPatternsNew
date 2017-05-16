class CurrencyConverter
  attr_accessor :conversionToDollarRates

  def initialize
    @conversionToDollarRates = {"USD" => 1, "EUR" => 0.9378, "GBP" => 0.7974, "INR" => 64.54}
  end

  def addNewCurrency(currency, rate)
    @conversionToDollarRates[currency] = rate
  end

  def convert(amount, currency)
    return amount/@conversionToDollarRates[currency]
  end
end