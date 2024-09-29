import java.util.Scanner;

class m3a2q7 {
    
    public static int reverseNumber(int number) {
        int reversed = 0;
        int sign = number < 0 ? -1 : 1;  
        number = Math.abs(number);  
        while (number > 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit; 
            number /= 10; 
        }
        
        return sign * reversed; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        
        int result = reverseNumber(input);
        System.out.println("Reversed Number: " + result);
        
        sc.close();
    }
}
