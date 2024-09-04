import java.util.Scanner;

public class m2a2q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.println("Enter 1 for circle, 2-square,3-rectangle,4-triangle: ");
        int s = scanner.nextInt();

        System.out.println("your choose  " + s);
       
        switch (s){
        case 1: System.out.println("enter r  ");
                int r =scanner.nextInt(); 
                System.out.println("circle area" +(2*3.14*r*r)); break;
        case 2: System.out.println("enter l  ");
         int l = scanner.nextInt();
          System.out.println("square area is " +(l*l)); break;
        case 3:  System.out.println("enter lenght and bredth ");
                 int le = scanner.nextInt() ;int b = scanner.nextInt() ;
                System.out.println("square area is " +(le*b));  break;
        case 4: System.out.println("enter side");
        int a = scanner.nextInt();
        System.out.println("area of triangle is"+(0.5*a*a));break;
        default :  System.out.println("invalid");
        break;1
        }
        scanner.close();
    }
}
