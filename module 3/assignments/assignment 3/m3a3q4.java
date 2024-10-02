import java.util.Stack;

class m3a3q4 {

    
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        
        
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

           
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  
            }
          
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
     
        return stack.pop();
    }

    public static void main(String[] args) {
       
        String postfixExpr1 = "53+2*";  // Same as "5 3 + 2 *"
        System.out.println("Output for Test Case 1: " + evaluatePostfix(postfixExpr1));  // Expected: 16

      
        String postfixExpr2 = "45*6/";  // Same as "4 5 * 6 /"
        System.out.println("Output for Test Case 2: " + evaluatePostfix(postfixExpr2));  // Expected: 3
    }
}
