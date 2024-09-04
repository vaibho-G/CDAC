package module2_assignment2;
import java.util.Scanner;



public class module2_assig2 {
	
	public static boolean isLeapYearifelse(int year) {
	    if (year % 4 == 0) {
	        if (year % 100 == 0) {
	            return year % 400 == 0;
	        } else {
	            return true;
	        }
	    } else {
	        return false;
	    }
	};
	private static boolean LeapYearSwitchCase(int year) {
        switch (year % 4) {
            case 0:
                switch (year % 100) {
                    case 0:
                        return (year % 400 == 0);
                    default:
                        return true;
                }
            default:
                return false;
        }
    }
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Input year
	        System.out.println("Enter a year: ");
	        int year = scan.nextInt();
	        
	        System.out.println("year is "+ year);
	        
	        
	        if (isLeapYearifelse(year)) {
	            System.out.println(year + " is a leap year through ifelse.");
	        } else {
	            System.out.println(year + " is not a leap year through ifelse.");
	        }
	        if (LeapYearSwitchCase(year)) {
	            System.out.println(year + " is a leap year with switch");
	        } else {
	            System.out.println(year + " is not a leap year with switch");
	        }

	        scan.close();
	        

}
	 }
