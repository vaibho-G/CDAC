import java.util.Scanner;
class m3a1q3{

    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}