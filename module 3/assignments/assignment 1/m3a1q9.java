import java.util.Scanner;

class m3a1q9 {

   
    public static boolean isPalindrome(int number) {

        
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

      
        while (number != 0) {
            int digit = number % 10;        
            reversedNumber = reversedNumber * 10 + digit;  
            number = number / 10;         
        }

        
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = sc.nextInt();

    
        if (isPalindrome(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
