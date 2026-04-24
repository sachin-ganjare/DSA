import java.util.Scanner;

public class InfixtoPofix {

   static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    static String infixtopostfix(String e) {
        // Defining a Dynamic Stack
        StackL<Character> a = new StackL<Character>();

        // Input definitions
        String result = new String("");

        // For loop to get each character in string
        for (int i = 0; i < e.length(); ++i) {
            char c = e.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result = result + c;
            } else if (c == '(') {
                // push into the stack if encountered (
                a.push(c);
            } else if (c == ')') {
                // pop all fron the stack till peek element is '(' if encountered ')'
                while (!a.isEmpty() && a.peek() != '(') {
                    result += a.pop();
                };
                if (!a.isEmpty() && a.peek() != '(') {
                    return "Invalid Expression!";
                } else {
                    // element the bracket
                    a.pop();
                }
            } else {
                // for operators
                // greater precedence for stack then - pop()
                while (!a.isEmpty() && precedence(c) <= precedence(a.peek())) {
                    result += a.pop();
                }           
                a.push(c);
            }
        };
        while(!a.isEmpty()){
            if( a.peek() == '(')
                return "Invalid Expression!";
            result += a.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter your Expression: ");
        Scanner sc = new Scanner(System.in);
        String expression1 = sc.nextLine();
        sc.close();
        System.out.println("Input Expression is: " + expression1);
        System.out.println("Output Expression: "+ InfixtoPofix.infixtopostfix(expression1));
    }
}
