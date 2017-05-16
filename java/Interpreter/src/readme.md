This is an example of Interpreter design pattern.

Expression is an interface which represents abstract expression class and it contains interpret method which each of the concrete expression class needs to implement

AddExpression is a composite expression, meaning that it needs another expression to perform its own interpretation. In this case, NumberExpression is that expression.

NumberExpression is a terminal expression, it takes in the number string and returns its equivalent number.

Your Task is to implement SubtractExpression which should be able to implement expressions of the type 'a-b'. 

Example output:
Type expression of type a + b or a - b (type q to quit)
4 + 5
9
Type expression of type a + b or a - b (type q to quit)
8 - 1
7
Type expression of type a + b or a - b (type q to quit)
q
