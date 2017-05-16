import java.util.List;

public class ExpressionReader {
	public Expression ReadToken(List<String> tokenList) {
		return ReadNextToken(tokenList);
	}

	private Expression ReadNextToken(List<String> tokenList) {
		NumberExpression firstComponentExpression = null;
		NumberExpression secondComponentExpression = null;
		try {
			firstComponentExpression = new NumberExpression(tokenList.get(0));
			secondComponentExpression = new NumberExpression(tokenList.get(2));

			if (tokenList.get(1).contains("+")) {
				return new AddExpression(firstComponentExpression, secondComponentExpression);
			} else
				return new SubtractExpression(firstComponentExpression, secondComponentExpression);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Please add spaces inbetween the expressions.");
			return null;
		}

	}
}