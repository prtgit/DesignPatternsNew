require_relative 'visitable'
require_relative 'visitor'
require_relative 'order'

class Customer < Visitable
  attr_accessor :name
  def initialize(name)
    @name = name
    @orders = Array.new
  end

  def accept(visitor)
    visitor.visit(self)
    for order in @orders
      order.accept(visitor)
    end
  end

  def add_order(order)
    @orders.push(order)
  end
end