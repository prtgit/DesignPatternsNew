

import java.util.ArrayList;

public class VisitorPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer c1 = new Customer("Customer1");
		Order order1 = new Order("Order1");
		order1.addItem("Item1");
		order1.addItem("Item2");
		c1.addOrder(order1);
		Order order2 = new Order("Order2");
		order1.addItem("Item3");
		order1.addItem("Item4");
		c1.addOrder(order2);
		customers.add(c1);

		Customer c2 = new Customer("Customer2");
		Order order3 = new Order("Order3");
		order3.addItem("Item5");
		order3.addItem("Item6");
		c2.addOrder(order3);
		customers.add(c2);

		GeneralReport visitor = new GeneralReport();

		for (Customer thisCustomer: customers){
			thisCustomer.accept(visitor);
		}

		visitor.displayResults();
	}
}
