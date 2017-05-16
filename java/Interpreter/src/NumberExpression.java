//terminal expression
public class NumberExpression implements Expression
{
    String number;
    public NumberExpression(String i)
    {
        number = i;
    }

    // interpret the string to int
    public int interpret()
    {
        return Integer.parseInt(number);
    }
}