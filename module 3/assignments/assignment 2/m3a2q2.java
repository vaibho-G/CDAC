
import java.util.*;
class m3a2q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        int [] arr=new int [n];
       HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+" element");
            arr[i]=sc.nextInt();
           map.add(arr[i]);
        }
        // map.containsKey(ch)
        System.out.println(map.size());
        
    }
}