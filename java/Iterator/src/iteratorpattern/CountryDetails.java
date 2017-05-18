package iteratorpattern;

import java.util.Iterator;

public class CountryDetails {
	public static void main(String[] args){
		Iterator it;
		System.out.println("Country Set");
		it = new CountrySet().__________; //>> Blank 2
		displayCountries(it);
		System.out.println("Country Array");
		it = new CountryArray().___________; //>> Blank 3
		displayCountries(it);
		System.out.println("Country List");
		it = new CountryList().____________; //>> Blank 4
		displayCountries(it);		
	}
	public static void displayCountries(Iterator it){
		while (it.hasNext()){
			Country c= ____________; //>> Blank 5
			System.out.println("Country Name = "+c.getName()+" Country Area = "+c.getArea()+" Country Population = "+c.getPopulation() );
		}
	}
}
