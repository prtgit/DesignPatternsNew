require_relative 'expression'

# compound expression
class AddExpression < Expression
  attr_accessor :leftExpression
  attr_accessor :rightExpression

  def initialize(left, right)
    @leftExpression = left
    @rightExpression = right
  end

  # interpret each number and add them
  def interpret
    return @leftExpression.interpret + @rightExpression.interpret
  end
end