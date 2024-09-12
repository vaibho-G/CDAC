package day5.org;

import java.util.Scanner;

public class CompoundInterestCalculator {
	private int initial_investment_amount;
	private double annual_interest_rate;
	private int i;
	private int year;
	
	public CompoundInterestCalculator() {
		this.initial_investment_amount=1000;
		this.annual_interest_rate=1.5;
		this.i=2;
		this.year=5;
	}
	
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



	public int getInitial_investment_amount() {
		return initial_investment_amount;
	}

	public void setInitial_investment_amount(int initial_investment_amount) {
		this.initial_investment_amount = initial_investment_amount;
	}

	public double getAnnual_interest_rate() {
		return annual_interest_rate;
	}

	public void setAnnual_interest_rate(double annual_interest_rate) {
		this.annual_interest_rate = annual_interest_rate;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public static void main(String[] args) {

		CompoundInterestCalculator c=new CompoundInterestCalculator();
		c.setInitial_investment_amount(1000);
		c.setAnnual_interest_rate(1.5);
		c.setI(2);
		c.setYear(5);
		
		c.print();
		c.cal();

	}

}
