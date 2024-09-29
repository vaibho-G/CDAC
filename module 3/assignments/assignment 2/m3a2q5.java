import java.util.*;
public class m3a2q5{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
      
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}