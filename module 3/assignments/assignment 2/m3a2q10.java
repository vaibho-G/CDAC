import java.util.Scanner;
class m3a2q10{
    public static  void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter d");
        int d=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Input: arr = [1, 2, 3, 4, 5], d = 2
        // Output: [3, 4, 5, 1, 2]
        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }

        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
        }

        
        
    }
}