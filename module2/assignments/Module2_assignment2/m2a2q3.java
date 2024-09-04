import java.util.Scanner;

public class m2a2q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("your age is "+ age);
        if (age <=18) {
            System.out.println("You are eligible.");
        } 
        
        else {
            System.out.println("You are not eligible");
        }

        scanner.close();
    }
}
