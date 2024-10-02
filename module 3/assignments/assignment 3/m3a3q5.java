import java.util.Stack;

class m3a3q6 {

  
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String exp) {
  
        StringBuilder result = new StringBuilder();
        
     
        Stack<Character> stack = new Stack<>();

       
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            
            else if (c == '(') {
                stack.push(c);
            }
           
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();  
            }

            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);  
            }
        }

        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String exp1 = "A+B*C";
        System.out.println("Postfix of '" + exp1 + "': " + infixToPostfix(exp1));  // Expected: ABC*+

     
        String exp2 = "(A+B)*C";
        System.out.println("Postfix of '" + exp2 + "': " + infixToPostfix(exp2));  // Expected: AB+C*

        
        String exp3 = "A+B*(C^D-E)";
        System.out.println("Postfix of '" + exp3 + "': " + infixToPostfix(exp3));  // Expected: ABCD^E-*+
    }
}
