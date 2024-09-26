import java.util.Scanner;
class m3a1q4{
    public static int fibonacci(int n) {
       
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String args[]){
        for (int i = 0; i <= 5-2; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
    }
}