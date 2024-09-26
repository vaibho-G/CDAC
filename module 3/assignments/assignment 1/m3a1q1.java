import java.util.Scanner;
class m3a1q1{
    public static void main(String [] args){
       //  Armstrong Number
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n= s.length();
        int no=Integer.parseInt(s);
        int []arr=new int [n];
        for(int i=0;i<s.length();i++){
            arr[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+= arr[i]*arr[i]*arr[i];
        }
        if(sum==no){
            System.out.println("yes");
        }
        else   System.out.println("no");
       
    }
}