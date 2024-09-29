// String result = reverseString(input);
import java.util.*;
public class m3a2q4{
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result = reverseString(s);
        System.out.println(result);

    }
}