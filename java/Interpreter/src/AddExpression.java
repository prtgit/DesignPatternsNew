// Compound expression
public class AddExpression implements Expression
{
    Expression leftExpression;
    Expression rightExpression;

    public AddExpression(Expression left, Expression right)
    {
        leftExpression = left;
        rightExpression = right;
    }
    
    // interpret each number expression and add them
	public int interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}
}