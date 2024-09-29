import java.util.*;
public class m3a2q6{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
      
        Stack<String> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(sc.nextLine());
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}