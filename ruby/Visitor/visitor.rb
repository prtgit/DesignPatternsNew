class Visitor
  def visit(customer)
    raise NotImplementedError, 'Ask the subclass'
  end
end