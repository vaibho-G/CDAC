package day5.org;

import java.util.Scanner;

public class CompoundInterestCalculator {
	private int initial_investment_amount;
	private double annual_interest_rate;
	private int i;
	private int year;
	
	public void acc() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter initial_investment_amount ");
		this.initial_investment_amount=sc.nextInt();
		System.out.println("enter annual_interest_rate ");
		this.annual_interest_rate= sc.nextDouble();
		System.out.println("enter i ");
		this.i=sc.nextInt();
		System.out.println("enter year ");
		this.year=sc.nextInt();
		sc.close();
	}
	public void print() {
		System.out.println( this.initial_investment_amount );
		System.out.println( this.annual_interest_rate );
		System.out.println( this.i );
		System.out.println( this.year );
		
	
	}
	
	public void cal() {
		double ans=initial_investment_amount * Math.pow((1 + annual_interest_rate / i), i * year);
		double total_intrest= ans-this.initial_investment_amount;
		System.out.println( "total intrest "+total_intrest );
		System.out.println( " future vale "+ans );
	}

	public static void main(String[] args) {

		CompoundInterestCalculator c=new CompoundInterestCalculator();
		c.acc();
		c.print();
		c.cal();

	}

}
