require_relative 'number_expression'
require_relative 'add_expression'
require_relative 'subtract_expression'
require_relative 'expression'

class ExpressionReader
  def readToken(tokenList)
    return readNextToken(tokenList)
  end

  def readNextToken(tokenList)
    firstComponentExpression = NumberExpression.new(tokenList[0])
    secondComponentExpression = NumberExpression.new(tokenList[2])

    if (tokenList[1] == '+')
        return AddExpression.new(firstComponentExpression, secondComponentExpression)
    else
        return SubtractExpression.new(firstComponentExpression, secondComponentExpression)
    end
  end
end