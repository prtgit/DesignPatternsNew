require_relative 'expression_reader'
require_relative 'expression'

puts 'Type expression of type a + b or a - b (type q to quit)'
tokenString = gets.chomp
if tokenString != 'q'
  tokens = tokenString.split("\s")
  reader = ExpressionReader.new
  expression = reader.readToken(tokens)
  print expression.interpret
end