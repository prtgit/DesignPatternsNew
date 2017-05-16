

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	Map<String, Float> conversionToDollarRates = new HashMap<String, Float>();;
	
	public CurrencyConverter(){
		this.conversionToDollarRates.put("USD", (float) 1);
		this.conversionToDollarRates.put("EUR", (float)0.9378);
		this.conversionToDollarRates.put("GBP", (float)0.7974);
		this.conversionToDollarRates.put("INR", (float)64.54);
	}

	public Map<String, Float> getConversionToDollarRates() {
		return conversionToDollarRates;
	}

	public void addNewCurrency(String currency, float rate){
		conversionToDollarRates.put(currency, rate);
	}
	
	public float convert(float amount, String currency){
		return amount/conversionToDollarRates.get(currency);
	}
	
}
