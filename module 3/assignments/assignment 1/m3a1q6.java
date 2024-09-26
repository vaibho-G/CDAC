import java.util.Scanner;
class m3a1q6{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean b=true;
        for(int i=0 ;i<=number;i++){
            if(number==i*i){
                System.out.print(i);
                b=false;
            }
        }int ans=0;
            for(int i =0;i<=number;i++){
                if(number<i*i){
                    ans=i-1;
                    break;
                }
            }
            if(b)System.out.print(ans);

}
}