package day5.org;

import java.util.Scanner;
class bank{
	private int principal_amount;
	private double annual_interest_rate;
	private int loan_term;
	private double monthly_payment;
	
	public bank() {
		 this.principal_amount=0;
		this.annual_interest_rate=0.0;
		 this.loan_term=0;
		this.monthly_payment=0.0;
	}
	

	public void acc(){
		//Accept the principal amount (loan amount),
		//annual interest rate, and loan term (in years) from the user.
	Scanner sc= new Scanner(System.in);
		System.out.println("enter principl amount");
		this.principal_amount= sc.nextInt();
		System.out.println("enter annual interest rate");
		this.annual_interest_rate=sc.nextDouble();
		System.out.println("enter loan term");
		this.loan_term=sc.nextInt();
	}
	public void cal() {
		//monthlyPayment = principal * (monthlyInterestRate * (1 +
		//monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	// WheremonthlyInterestRate = annualInterestRate / 12 / 100 andnumberOfMonths = loanTerm * 12.
		//annual_interest_rate.
		
	
		 double monthlyInterestRate = (annual_interest_rate / 12) / 100;
	        
	        
	        int numberOfMonths = loan_term * 12;

	      
	        this.monthly_payment = principal_amount*(monthlyInterestRate*Math.pow(1 + monthlyInterestRate, numberOfMonths))/(Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
	}
	 
	public void display() {
		
		
		double total_amount_paid = this.monthly_payment * loan_term * 12;
				System.out.println("monthly paymen "+monthly_payment);
				System.out.println("total amount paid over the life of the loan "+total_amount_paid);
	}
	public int getPrincipal_amount() {
		return principal_amount;
	}
	public void setPrincipal_amount(int principal_amount) {
		this.principal_amount = principal_amount;
	}
	public double getAnnual_interest_rate() {
		return annual_interest_rate;
	}
	public void setAnnual_interest_rate(double annual_interest_rate) {
		this.annual_interest_rate = annual_interest_rate;
	}
	public int getLoan_term() {
		return loan_term;
	}
	public void setLoan_term(int loan_term) {
		this.loan_term = loan_term;
	}
	

}


public class LoanAmortizationCalculator {

	public static void main(String[] args) {
		
		bank ref= new bank();
		ref.setPrincipal_amount(100);
		ref.setAnnual_interest_rate(1.5);
		ref.setLoan_term(5);
		
		ref.cal();
		ref.display();
		

	}

}
