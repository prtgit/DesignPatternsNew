
import java.util.ArrayList;

public class Order implements Visitable {

	String name;

	private ArrayList<String> items = new ArrayList<String>();

	public Order(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public void addItem(String item) {
		items.add(item);
	}

}
