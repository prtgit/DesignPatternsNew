require_relative 'customer'
require_relative 'general_report'

customers = Array.new
c1 = Customer.new("Customer1")
order1 = Order.new("Order1")
order1.addItem("Item1")
order1.addItem("Item2")
c1.add_order(order1)
order2 = Order.new("Order2")
order1.addItem("Item3")
order1.addItem("Item4")
c1.add_order(order2)
customers.push(c1)

c2 = Customer.new("Customer2")
order3 = Order.new("Order3")
order3.addItem("Item5")
order3.addItem("Item6")
c2.add_order(order3)
customers.push(c2)

visitor = GeneralReport.new

for thisCustomer in customers
  thisCustomer.accept(visitor)
end

visitor.display_results

