public class SubtractExpression implements Expression
{
    Expression leftExpression;
    Expression rightExpression;

    public SubtractExpression(Expression left, Expression right)
    {
        leftExpression = left;
        rightExpression = right;
    }

    public int interpret()
    {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}