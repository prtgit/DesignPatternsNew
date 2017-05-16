import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Program
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		System.out.println("Type expression of type a + b or a - b (type q to quit)");
        	String tokenString = sc.nextLine();
        	if (!tokenString.equals("q")){
        		String[] tokens = tokenString.split(" ");
            	List<String> tokenList = new ArrayList<String>(Arrays.asList(tokens));
            
            	ExpressionReader reader = new ExpressionReader();
            	Expression expression = reader.ReadToken(tokenList);
            	System.out.println(expression.interpret()); 
        	}
            else{
            	break;
            }
    	}
    }
}