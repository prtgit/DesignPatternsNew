require_relative 'visitable'
require_relative 'visitor'

class Order < Visitable
  attr_accessor :name
  def initialize(name)
    @name = name
    @items = Array.new
  end

  def accept(visitor)
    visitor.visit(self)
  end

  def addItem(item)
    @items.insert(item)
  end
end