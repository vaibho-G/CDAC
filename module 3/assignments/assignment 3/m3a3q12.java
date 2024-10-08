class m3a3q12 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 9, 8, 7, 5};
        int n = arr.length;
        int k = 5;  
        int temp = Integer.MIN_VALUE;

        
        for (int i = 0; i < k; i++) {
            int maxIndex = -1;
            int maxValue = Integer.MIN_VALUE;
            
           
            for (int j = 0; j < n; j++) {
                if (arr[j] > maxValue) {
                    maxValue = arr[j];
                    maxIndex = j;
                }
            }
            
           
            if (maxIndex != -1) {
                arr[maxIndex] = Integer.MIN_VALUE;
            }
            
            temp = maxValue;  
        }

       
        System.out.println("The " + k + "th largest element is: " + temp);
    }
}

