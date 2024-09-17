package assign6.org;

public class assign6que3 {

	public static void main(String[] args) {
		 int arr[] = new int[]{1,2,3,4,5};
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max){
	                max = arr[i];
	            } 

	}
	        for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < min) {
                min = arr[i];
            }
	}
	        System.out.println("Minimun: "+ min);
	        System.out.println("Maximum: "+ max);
}
}