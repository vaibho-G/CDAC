class m3a3q2 {
    char[] arr = new char[10];
    int top;

    m3a3q2() {
        top = -1;
    }


    void push(char a) {
        if (top < 9) { 
            top++;
            arr[top] = a;
        } else {
            System.out.println("Stack is full");
        }
    }


    char pop() {
        if (top != -1) {
            int temp = top;
            top--;
            return arr[temp];
        } else {
            System.out.println("Stack is empty");
            return '*';
        }
    }

   
    char peek() {
        if (isempty()) return '*';
        else return arr[top];
    }


    boolean isempty() {
        return top == -1;
    }

 
    boolean isfull() {
        return top == 9;
    }

    public static void main(String[] args) {
        m3a3q2 stack = new m3a3q2();

        String s = "{()}";

   
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
       
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }
      
            else if (ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ')' && stack.peek() == '(') { 
                stack.pop();
            } else if (ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                System.out.println("Unbalanced");
                return;
            }
        }

       
        if (stack.isempty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }
}
