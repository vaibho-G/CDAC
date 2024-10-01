class m3a3q3 {
    char[] arr = new char[10];
    int top;

    m3a3q3() {
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
        m3a3q3 stack = new m3a3q3();

        String s = "abc";

       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
                stack.push(ch);
            }
            for (int i = 0; i < s.length(); i++) {
                 char ch1=stack.pop();
                 System.out.print(ch1);
                }
        }
}
