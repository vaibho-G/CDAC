import java.util.Scanner;

public class m3a2q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String s = sc.nextLine();
        
        
        String reversed = new StringBuilder(s).reverse().toString();
        
        
        if (s.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        sc.close();
    }
}
