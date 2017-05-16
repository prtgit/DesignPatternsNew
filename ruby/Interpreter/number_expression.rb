require_relative 'expression'

# terminal expression
class NumberExpression < Expression
  attr_accessor :number
  def initialize(i)
    @number = i
  end

  # interpret the strings to integert
  def interpret
    return @number.to_i
  end
end