
import java.util.ArrayList;

public class Customer implements Visitable {

	String name;

	private ArrayList<Order> orders = new ArrayList<Order>();

	public void accept(Visitor visitor) {
		visitor.visit(this);	
		for (Order eachOrder: orders){
			eachOrder.accept(visitor);
		}
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public Customer(String name) {
		this.name = name;
	}
}
