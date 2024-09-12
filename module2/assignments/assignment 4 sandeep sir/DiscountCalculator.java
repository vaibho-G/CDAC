package day5.org;
import java.util.Scanner;
public class DiscountCalculator {

	private double price;
	private double discout;
	private double discountAmount;
	private double finalPrice ;
	public void acc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the item : ");
        this.price = scanner.nextDouble();

        System.out.print("Enter the discount : ");
        this.discout = scanner.nextDouble();
    }
	public void cal() {
		this.discountAmount = this.price*(this.discout/100);
        this.finalPrice = this.price - this.discountAmount;
	}
	public void print() {
		System.out.printf("discout amount : %.2f\n",discountAmount);
		System.out.printf("final amount : %.2f\n",finalPrice);
	
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscout() {
		return discout;
	}
	public void setDiscout(double discout) {
		this.discout = discout;
	}
	public String  toString() {
		return String.format("Original Price: ₹%.2f%nDiscount Rate: %.2f%%%nDiscount Amount: ₹%.2f%nFinal Price: ₹%.2f",
                price, discout, discountAmount, finalPrice);
	}
	public static void main(String[] args) {
	
		DiscountCalculator d=new DiscountCalculator();
		//d.acc();
		d.setDiscout(10);
		d.setPrice(1200);
		d.cal();
		d.print();
		System.out.println(d.toString());
	}

}
