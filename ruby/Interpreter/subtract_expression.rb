require_relative 'expression'

class SubtractExpression < Expression
  attr_accessor :leftExpression
  attr_accessor :rightExpression

  def initialize(left, right)
    @leftExpression = left
    @rightExpression = right
  end

  # interpret each number and subtract them
  def interpret
    return @leftExpression.interpret - @rightExpression.interpret
  end
end