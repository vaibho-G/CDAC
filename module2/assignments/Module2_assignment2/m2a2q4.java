import java.util.Scanner;

public class m2a2q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.println("Enter your month: ");
        int month = scanner.nextInt();

        System.out.println("your month  is  "+ month);
       
        switch (month){
        case 1: System.out.println("winter"); break;
        case 2: System.out.println("winter"); break;
        case 3: System.out.println("winter"); break;
        case 4: System.out.println("Summer"); break;
        case 5: System.out.println("Summer"); break;
        case 6: System.out.println("Summer"); break;
        case 7: System.out.println("Summer"); break;
        case 8: System.out.println("Autumn"); break;
        case 9: System.out.println("Autumn"); break;
        case 10: System.out.println("winter"); break;
        case 11: System.out.println("Spring"); break;
        case 12: System.out.println("Spring"); break;
        default :  System.out.println("invalid");
        }
        scanner.close();
    }
}
