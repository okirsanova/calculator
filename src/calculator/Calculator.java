package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {

        String a = expression[0];
        String b = expression[2];
        String c = expression[4];
        String op = expression[1];
        String op2 = expression[3];

        if (expression.length == 5) {
            System.out.println("HEEEY!");}

            double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);
        double dc = Double.parseDouble(c);

        double result;
        double result2;
        switch (op) {
            case "+":
                result = da + db;
                break;
            case "-":
                result = da - db;
                break;
            default:
                return "Error";
            }

            switch (op2) {
                case "+":
                    result2 = result + dc;
                    break;
                case "-":
                    result2 = result - dc;
                    break;
                default:
                    return "Error";
            }
            return String.valueOf(result2);
        } }
