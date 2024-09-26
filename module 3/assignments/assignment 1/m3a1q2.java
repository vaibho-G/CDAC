import java.util.Scanner;
class m3a1q2{
   
        static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        if (isPrime(n))
            System.out.println("true");
        else
            System.out.println("false");
        
    }
    }
