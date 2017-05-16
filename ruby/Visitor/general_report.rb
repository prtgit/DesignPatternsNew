require_relative 'customer'
require_relative 'visitor'
require_relative 'order'

class GeneralReport < Visitor
  attr_accessor :customers_no
  attr_accessor :orders_no

  def visit(customer)
    if customer.kind_of? Customer
      print "Cusomer #{customer.name}\n"
      @customers_no ||= 0
      @customers_no = @customers_no + 1
    else
      print "Order #{customer.name}\n"
      @orders_no ||= 0
      @orders_no += 1
    end
  end

  def display_results
    print "Number of customers: #{customers_no}\n"
    print "Number of orders: #{orders_no}\n"
  end
end