package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {

        double result = Double.parseDouble(expression[0]);


        for (int i = 1; i < expression.length; i +=2){
            System.out.println(i + ": " + expression[i]);
            String op = expression[i];
            double b = Double.parseDouble(expression[i + 1]);
            switch (op) {
                case "+":
                    result += b;
                    break;
                case "-":
                    result -= b;
                    break;
                case "/":
                    result /= b;
                    break;
                case "*":
                    result *= b;
                    break;
                default:
                    return "Error";

            }
        }

        return String.valueOf(result);
    }
}