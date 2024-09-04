package module2_assignment2;
import java.util.Scanner;


//Implement a program that calculates the Body Mas
//s Index (BMI) based on height and weight input using 
//if-else to classify the BMI int categories 
//(underweight, normal weight, overweight,etc).

public class module2_assig2 {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.println("Enter a height: ");
	        int height = scan.nextInt();
	        System.out.println("Enter a weight: ");
	        int weight = scan.nextInt();
	        
	        System.out.println("hieght and weight is "+ height +" "+ weight);
	        
	        
	       int bmi = height * weight;
	       System.out.println("bmi is: " + bmi);
	       if(bmi>=0 && bmi<=10)
	    	   System.out.println("you are underweight ");
	       else if(bmi>11 && bmi<=30)
	    	   System.out.println("you are normal weight ");
	       else if(bmi>=31 && bmi<100)
	    	   System.out.println("you are normal weight ");

	        scan.close();
	        

}
	 }
