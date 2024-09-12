package day5.org;

import java.util.Scanner;

public class BMITracker {
	public BMITracker() {
		weight=0;
		height=0;
	}
public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
private int weight;
private int height;

public void acc() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter height ");
	this.height=sc.nextInt();
	System.out.println("enter weight ");
	this.weight=sc.nextInt();
}

public void bmi() {
	double bmi_of_person= this.weight/(this.height*this.height);
	if(bmi_of_person<18.5) {System.out.println("Underweight");}
	else if(bmi_of_person>=18.5 &&  bmi_of_person<24.9) {System.out.println("Normal weight");}
	else if(bmi_of_person>=25 &&  bmi_of_person<29.9) {System.out.println(" overweight");}
	else if(bmi_of_person>30) {System.out.println("obese");}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMITracker b =new BMITracker();
		//b.acc();
		b.setWeight(800);
		b.setHeight(5);
		b.bmi();
	}

}
