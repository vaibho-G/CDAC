package assign6.org;
import java.util.Scanner;
public class assign6que1 {
	public static int[] acceptRecord(int arr[]){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+i +" Element: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

     static  void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
     }

	public static void main(String[] args) {
		
		 int arr[] = new int[5];

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]+" ");//default value 0
	        }
	        System.out.println();
	         acceptRecord(arr);
	         print(arr);
		
	}

}
